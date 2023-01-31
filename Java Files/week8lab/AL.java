package week8lab;

import java.util.ArrayList;

import Generics.Student;

public class AL {
    public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<Student>();
        Student Student1 = new Student("Agnes", 30);
        Student Student2 = new Student("Aretha", 29);
        Student Student3 = new Student("Adam", 42);
        Student Student4 = new Student("Arnold", 60);
        Student Student5 = new Student("Alexander", 30);
        myList.add(Student1);
        myList.add(Student2);
        myList.add(Student3);
        myList.add(Student4);
        myList.add(Student5);
        int n = myList.size();
        System.out.println("This list has size " + n); // 5
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));
    }
}