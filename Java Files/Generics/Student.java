package Generics;

public class Student implements Comparable {
    private int grade;
    private String name;

    public Student(String n, int g) {
        name = n;
        grade = g;
    }

    public int getGrade() {
        return grade;
    }

    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student other = (Student) o;
            if (this.getGrade() > other.getGrade()) {
                return 1;
            } else if (this.getGrade() < other.getGrade()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
