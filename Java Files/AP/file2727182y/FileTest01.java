package file2727182y;

public class FileTest01 {
	public static void main(String[] args) {
		Directory dic1 = new Directory("dic1");
        Directory dic2 = new Directory("dic2");
        Directory dic3 = new Directory("dic3");
        Directory dic4 = new Directory("dic4");
        Directory dic5 = new Directory("dic5");

		File coursework = new File("coursework",90);
		dic4.add(dic5);
        dic3.add(dic4);
        dic2.add(dic3);
        dic1.add(dic2);
        dic5.add(coursework);
        System.out.println(dic1.display("\t"));
        dic5.remove(coursework);
        System.out.println(dic1.display("\t"));
	}
}