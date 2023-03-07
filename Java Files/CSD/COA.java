package CSD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class COA {
    static final int windowLength = 5;// set the length of plaintext detection window

    public static void main(String[] args) {
        String COAcipherText = "Evr sk_s})?myLcQSTP)J\"\\yxUZGWZc&*xdL|6:OwGsh5l\\}9#G#bB)@W[=r)\\)tsr|$>5GFFh?!|\"3pjHM(mWp\\ZxETy]~SgW^<rad?W`.LcHz;:/u?[)&o:836NnK!MzzAtFA+Q]NT}, wZp@@+t: 9-l\'xpM7$z9:eH<UwPeh9 ,~rSRl<Z!cfU1?\\DHsk_s]I(jwxnm\"~-P,-Ok62_2GVa5o_$oDk<He1Q}&e,Zke,162mBB^*l@vgoCbNF?$txj!V{A4|&X9RbPQm*5*0y=/@&~$g=rTw@snKm`^CmH^;;LJs+lQ-\\ui9\"E%}=lP<9>";
        String plainText = "This is the second task (Ciphertext Only Attack) of the assignment of the Cryptography and Secure Development course. Fukang - you are expected to decode it with the assumption that this plaintext is English sentences. This plaintext contains this random number 9820 so that you cannot guess it from the others :) Finger-crossed!";
        fun(COAcipherText);// fun() is the dictionary attack and the plain text filtering method
        // following codes are the experiment to find out how many ciphertext letters
        // were needed to decode the message unambiguously.
        int i = 1;
        int numOfQualified = 0;
        do {
            numOfQualified = expVerifyActualNum(i, COAcipherText, plainText);
            i++;
        } while (numOfQualified > 1);
        System.out.println("the least ciphertext letters needed to decode the message unambiguously: " + (i - 1));
    }

    public static void fun(String cipherText) {
        FileReader fr = null;
        HashSet<String> set = new HashSet<>();// set to store unique characters
        try {
            fr = new FileReader("CSD/passwords");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);// read keys from
        String line;
        while (sc.hasNextLine()) {

            int englishLetterCounts = 0;
            line = sc.nextLine();
            int numOfWindows = 0;
            String plaintexts = Rotor96Crypto.encdec(Rotor96Crypto.DEC, line, cipherText);
            char[] chars = plaintexts.toCharArray();
            for (char c : chars) {
                int ascii = Integer.valueOf(c);
                if ((ascii > 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || ascii == 32 || ascii == 39
                        || ascii == 46 || ascii == 63)// if c is one of the English letters or normal punctuations
                {
                    englishLetterCounts++;
                }
                if (!set.contains(String.valueOf(c))) {// add all unique characters to set
                    set.add(String.valueOf(c));
                }
                continue;
            }
            if (englishLetterCounts * 1.0 / plaintexts.length() > 0.8) {
                System.out.println("plaintexts: " + plaintexts + "\n");
                System.out.println("password: " + line + "\n");
                System.out.println("correct rate: " + englishLetterCounts * 1.0 / plaintexts.length() + "\n");
            }
        }
        System.out.println("unique characters: ");
        for (String s : set) {
            System.out.print(s);
        }
        System.out.println("\n\nnumber of char set: " + set.size());
        sc.close();
    }

    public static int expVerifyActualNum(int textNum, String cipherText, String plainText) {
        int numOfTexts = 0;
        FileReader fr = null;
        try {
            fr = new FileReader("CSD/passwords");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        char[] realPlaintexts = plainText.toCharArray();
        Scanner sc = new Scanner(fr);// read keys from
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            char[] tempPlaintexts = Rotor96Crypto.encdec(Rotor96Crypto.DEC, line, cipherText).toCharArray();
            for (int i = 0; i < textNum; i++) {
                if (tempPlaintexts[i] != realPlaintexts[i])// if any character doesn't match, this text is not
                                                           // meaningful, break
                {
                    break;
                }
                if (i == textNum - 1) {
                    numOfTexts++;// found a suitable cipher text
                }
            }

        }
        sc.close();
        return numOfTexts;
    }
}
