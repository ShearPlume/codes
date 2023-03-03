package CSD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class KPA {
    public static void main(String[] args) {
        String KPAcipherText = "?^02&]@t\'tsXGHW0X7[DOY]#TAttwjssQN_\\3U%H3:955?\'/ZdDt\"N\\a6Zj.(Vw_<8f8JTPQE<K?3rP<0uI7]mdsw3DJ]x3\"ho";
        String COAcipherText = "Evr sk_s})?myLcQSTP)J\"\\yxUZGWZc&*xdL|6:OwGsh5l\\}9#G#bB)@W[=r)\\)tsr|$>5GFFh?!|\"3pjHM(mWp\\ZxETy]~SgW^<rad?W`.LcHz;:/u?[)&o:836NnK!MzzAtFA+Q]NT}, wZp@@+t: 9-l\'xpM7$z9:eH<UwPeh9 ,~rSRl<Z!cfU1?\\DHsk_s]I(jwxnm\"~-P,-Ok62_2GVa5o_$oDk<He1Q}&e,Zke,162mBB^*l@vgoCbNF?$txj!V{A4|&X9RbPQm*5*0y=/@&~$g=rTw@snKm`^CmH^;;LJs+lQ-\\ui9\"E%}=lP<9>";
        fun(KPAcipherText);
    }

    public static void fun(String cipherText) {

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
            if (chars[0] == "T".toCharArray()[0] && chars[1] == "h".toCharArray()[0]) {
                System.out.println("password: " + line);
                System.out.println("plaintexts: " + plaintexts);
            }
        }
        sc.close();       
    }
}
