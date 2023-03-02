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
        String plainText="This is the second task (Ciphertext Only Attack) of the assignment of the Cryptography and Secure Development course. Fukang - you are expected to decode it with the assumption that this plaintext is English sentences. This plaintext contains this random number 9820 so that you cannot guess it from the others :) Finger-crossed!";
        fun(COAcipherText);
        // fun2(COAcipherText);    
    }

    public static void fun(String cipherText) {
        FileReader fr = null;
        Vector<Thread> threadsVector;
        ArrayList<String> detectionWindow = new ArrayList<String>();
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
                if ((ascii > 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)||ascii==32||ascii==39||ascii==46||ascii==63)// if c is one of the English letters or normal punctuations
                {
                    englishLetterCounts++;
                    // detectionWindow.clear();// clear the window
                } //else {
                //     if (detectionWindow.size() == windowLength) {
                //         detectionWindow.clear();// clear the window
                //         numOfWindows++;

                //     } else {
                //         detectionWindow.add(String.valueOf(c));
                //     }
                // }
                continue;               
            }
            if (englishLetterCounts*1.0/plaintexts.length()>0.8) {
                System.out.println("plaintexts: " + plaintexts);
                System.out.println("rate: " + englishLetterCounts*1.0/plaintexts.length());
            }
        }
        sc.close();
    }

    public static void fun2(String cipherText)
    {
        FileReader fr = null;
        try {
            fr = new FileReader("CSD/passwords");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String plaintexts = Rotor96Crypto.encdec(Rotor96Crypto.DEC, line, cipherText);
            char[] chars = plaintexts.toCharArray();
            if (chars[0] == "T".toCharArray()[0]/* && chars[1] == "h".toCharArray()[0]*/ ) {
                System.out.println("plaintexts: " + plaintexts);
            }

        }
        sc.close();
    }

    public static int verifyActualNum(int textNum,String cipherText,String plainText)
    {
        // int tempNum=1;
        int numOfTexts=0;
        FileReader fr = null;
        // Vector<Thread> threadsVector;
        // ArrayList<String> detectionWindow = new ArrayList<String>();
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
            String wrong = "";
            for(int i=0;i<textNum;i++)
            {
                if(plaintexts.toCharArray()[i] !=plainText.toCharArray()[i])//if any character doesn't match, this text is not meaningful, break
                {
                    break;
                }
                else{
                    System.out.println("got one! ");
                }
                if(i==textNum-1) 
                {
                    numOfTexts++;
                }               
            }

        }
        sc.close();
        return numOfTexts;
    }
}
