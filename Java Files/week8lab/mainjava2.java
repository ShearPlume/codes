package week8lab;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

import Generics.*;


public class mainjava2 {
    static ArrayList<Student> students;
    static ArrayList<Integer> ints;
    static FileReader fr =null;
    public static void main(String[] args) {
        Student s1=new Student("DingYI",0 );
        Student s2=new Student("LuoJi",100);
        Student s3=new Student("Lfs",77);
        Student s4=new Student("dsf",55);
        Student s5=new Student("ggdr",32);
        students=new ArrayList<Student>(100);
        ints=new ArrayList<Integer>(1);
        students.add(s2);
        students.add(s1);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        Integer i1=100;
        Integer i2=88;
        System.out.println("www");
        ints.add(i1);
        ints.add(i2);

        ints.sort(Comparator.naturalOrder());

        students.sort(Comparator.naturalOrder());
        System.out.println(students.get(0).compareTo(students.get(1)));

    }
    
}
