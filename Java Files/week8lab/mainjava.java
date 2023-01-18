package week8lab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import Generics.*;


public class mainjava {
    static ArrayList<String> arrayList1;
    static FileReader fr =null;
    public static void main(String[] args) {
        arrayList1=new ArrayList<String>();
        try {
            fr = new FileReader("./week8lab/birds.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc=new Scanner(fr);
        while(sc.hasNextLine())
        {
            arrayList1.add(sc.nextLine());
        }    
        int i=0;
        for (String str : arrayList1) {
            i++;
            System.out.println(str);   
                  
        }  
        System.out.println(i);
        i=0;
        arrayList1.sort(Comparator.naturalOrder());

        for (String str : arrayList1) {
            i++;
            System.out.println(str);            
        }  
        System.out.println(i);




    }
    
}
