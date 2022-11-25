package Generics;

public class Student2 implements Comparable<Student2>{
    private int grade;
    private String name;
    public Student2(String n,int g) {
    name = n;
    grade = g;
    }
    public int getGrade() {return grade;}
    public int compareTo(Student2 o) {
    if(this.getGrade() > o.getGrade()) {
    return 1;
    }else if(this.getGrade() < o.getGrade()) {
    return -1;
    }else {
    return 0;
    }
    }
    }
    