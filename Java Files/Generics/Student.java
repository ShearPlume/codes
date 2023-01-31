package Generics;

import week8lab.test;

public class Student implements Comparable <Student>,test<String,Integer>{
    private int grade;
    private String name;
    public <T,E>void fun (T t1,E e1)
    {
        T t2=t1;

    }
    public String getname()
    {
        return name;
    }

    public Student(String n, int g) {
        name = n;
        grade = g;
    }

    public int getGrade() {
        return grade;
    }
    public int gun(String s1,Integer s2)
    {
        return 1;
    }

    public int compareTo(Student s) {
  
            if (this.getGrade() > s.getGrade()) {
                return 1;
            } else if (this.getGrade() < s.getGrade()) {
                return -1;
            } else {
                return 0;
            }

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I am"+this.name+" and my grade is:  "+this.grade;
    }
}
