package CSD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class KPA {
    public static void main(String[] args) {
        String KPAcipherText = "?^02&]@t\'tsXGHW0X7[DOY]#TAttwjssQN_\\3U%H3:955?\'/ZdDt\"N\\a6Zj.(Vw_<8f8JTPQE<K?3rP<0uI7]mdsw3DJ]x3\"ho";
        fun(KPAcipherText);
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
            String plaintexts = Rotor96Crypto.encdec(Rotor96Crypto.DEC, line, cipherText);
            char[] chars = plaintexts.toCharArray();
            if (chars[0] == "T".toCharArray()[0] && chars[1] == "h".toCharArray()[0]) {
                for (char c : chars) {
                    if (!set.contains(String.valueOf(c))) {// add all unique characters to set
                        // System.out.println(c);
                        // System.out.println(line);
                        set.add(String.valueOf(c));
                    }
                }
                System.out.println("plaintexts: " + plaintexts);
            }

        }
        sc.close();

        for (String s : set) {
            // System.out.println(s);
        }
        System.out.println("number of possible chars: " + set.size());
    }
}
