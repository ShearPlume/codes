import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedWriter;

public class labIO {
    public static void main(String[] args) {
        lab1();
        lab2();
        lab3();
    }

    public static void lab1() {
        FileReader fr = null;
        try {
            fr = new FileReader("./666/dolphin.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
        }
    }

    public static void lab2() {
        FileReader fr = null;
        try {
            fr = new FileReader("./666/sums.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            // get the next line
            int out = 0;
            String line = sc.nextLine();
            Scanner temp = new Scanner(line);
            int int1 = temp.nextInt();
            String cacu = temp.next();
            int int2 = Integer.parseInt(temp.next());
            if (cacu.equals("+"))
                out = int1 + int2;
            else if (cacu.equals("-"))
                out = int1 - int2;
            System.out.println(line + " = " + out);
        }
    }

    public static boolean CheckWrongSurname(String surname) {
        FileReader fr = null;
        try {
            fr = new FileReader("./filepath/Srecord.txt");// Create a FileReader object to read the file
        } catch (FileNotFoundException e) {// FileNotFoundException is thrown if the file doesn't exist
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            // get the next line
            String line = sc.nextLine();
            if (line.equals(surname))
                return true;
        }
        return false;
    }

    public static boolean checkAndReplaceSurname(String wrongSurname, String rightSurname) {// use it by typing the                                                                                           
        FileReader fr = null;
        try {
            fr = new FileReader("./filepath/Srecord.txt");// Create a FileReader object to read the file
        } catch (FileNotFoundException e) {// FileNotFoundException is thrown if the file doesn't exist
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            // get the next line
            String line = sc.nextLine();
            if (line.contains(wrongSurname))
            {
                String updatedLine = line.replace(wrongSurname, rightSurname);
                System.out.println("Updated surname: " + updatedLine);
            }  
            return true;// if found, return true
        }
        return false;// if not found, return false
    }

    public static void lab3() {
        FileReader fr = null;
        try {
            fr = new FileReader("./666/backwards.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        FileWriter fw = null;
        try {
            fw = new FileWriter("./666/forwards.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        int index = 0;
        char[] buffer = new char[500];
        char temp;
        while (true) {
            try {
                int ifend = fr.read();
                if (ifend == -1)
                    break;
                else {
                    temp = (char) ifend;
                    buffer[index++] = temp;
                }

            } catch (IOException e) {
            }
        }
        char[] fin = new char[index];
        System.arraycopy(buffer, 0, fin, 0, index);

        for (int i = 0; i < fin.length; i++) {
            try {
                bw.write(fin[fin.length - i - 1]);
                // bw.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
