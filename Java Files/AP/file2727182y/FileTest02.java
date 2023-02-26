package file2727182y;

public class FileTest02 {
public static void main(String[] args) {
    File courseworkpdf = new File("courseworkpdf",1);
    File courseworkzip = new File("coursework zip file",2);

    Directory coursework = new Directory("coursework");
    coursework.add(courseworkpdf);
    coursework.add(courseworkzip);

    Directory coursework1 = new Directory("coursework1");
    coursework.add(coursework1);

    Directory coursework2 = new Directory("coursework2");
    coursework1.add(coursework2);
    Directory coursework3 = new Directory("coursework3");
    coursework2.add(coursework3);

    File test111 = new File("123456",56);
    coursework1.add(test111);

    Directory unittests = new Directory("unit tests");
    File test1 = new File("unit test 1",56);
    unittests.add(test1);

    coursework.add(unittests);
    coursework.remove(courseworkzip);

    System.out.println(coursework.display("\t"));

    // System.out.println( coursework.search("unit test 1").getName() );
}
}
