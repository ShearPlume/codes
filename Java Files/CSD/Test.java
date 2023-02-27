package CSD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    // String s="This is the second task (Ciphertext Only Attack) of the assignment of the Cryptography and Secure Development course. Fukang - you are expected to decode it with the assumption that this plaintext is English sentences. This plaintext contains this random number 9820 so that you cannot guess it from the others :) Finger-crossed!";
    public static void main(String[] args) {
        String LiuText="ux(qnKZiUl_ZJ>N[%2n\"\"]UOT5~@5P$!fZeiPO`K:;%F~FlHB\"q+Qt%'&{Aw1tT579D8nGU2r^dkNne-&\\w}mlBb5R67;|-tX9A#";
        String KPAcipherText = "?^02&]@t\'tsXGHW0X7[DOY]#TAttwjssQN_\\3U%H3:955?\'/ZdDt\"N\\a6Zj.(Vw_<8f8JTPQE<K?3rP<0uI7]mdsw3DJ]x3\"ho";
        String COAcipherText = "Evr sk_s})?myLcQSTP)J\"\\yxUZGWZc&*xdL|6:OwGsh5l\\}9#G#bB)@W[=r)\\)tsr|$>5GFFh?!|\"3pjHM(mWp\\ZxETy]~SgW^<rad?W`.LcHz;:/u?[)&o:836NnK!MzzAtFA+Q]NT}, wZp@@+t: 9-l\'xpM7$z9:eH<UwPeh9 ,~rSRl<Z!cfU1?\\DHsk_s]I(jwxnm\"~-P,-Ok62_2GVa5o_$oDk<He1Q}&e,Zke,162mBB^*l@vgoCbNF?$txj!V{A4|&X9RbPQm*5*0y=/@&~$g=rTw@snKm`^CmH^;;LJs+lQ-\\ui9\"E%}=lP<9>";
        fun(COAcipherText);
    }

    public static void fun(String cipherText) {
        HashSet<String> set = new HashSet<>();
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
            int correctCounts = 0;
            String plaintexts = Rotor96Crypto.encdec(Rotor96Crypto.DEC, line, cipherText);
            char[] chars = plaintexts.toCharArray();
            String wrong = "";
            // if(chars[0]=="T".toCharArray()[0]&&chars[1]=="h".toCharArray()[0])
            // {
                for (char c : chars) {
                    // if (!set.contains(String.valueOf(c))) {
                    //     System.out.println(c);
                    //     System.out.println(line);
                    //     set.add(String.valueOf(c));
                    // }
                    int ascii = Integer.valueOf(c);
                    if (ascii == 32 || ascii == 33 || (ascii >= 39 && ascii <= 46) || (ascii >= 48 && ascii <= 61)
                            || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                        correctCounts++;
                    } else {
                        wrong = wrong + c;
                    }
                    // System.out.println(Integer.valueOf(c));
                }
                Double correctRate = correctCounts * 1.0 / chars.length;
                if (correctCounts * 1.0 / chars.length >0.95) {
                    System.out.println("correctCounts: " + correctCounts + " correctrate: " + correctRate * 100 + "%");
                    System.out.println("plaintexts: " + plaintexts);
                    System.out.println("wrong characters: " + wrong);
                }
            // }
            // {
           
        }
        sc.close();

        // for(String s :set)
        // {
        // ;
        // }
        // System.out.println("number of possible chars: " + set.size());
    }
}
