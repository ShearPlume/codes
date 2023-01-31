package AP.week2;

public class Pettest {
    public static void main(String[] args) {
        Pet[] pets = new Pet[4];
        pets[0] = new Cat("Tom", 3,"british blue cat","blue","mom's arms");
        pets[1] = new Dog("Pickle", 5000);
        pets[2] = new Dog("Dogmeat", 20);
        pets[3]=new Pet("Jerry",3);

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].toString());
        }
        // pets[0].provideBone();
    }
}
// 总结： 子类对象赋值给父类对象，使用时：
// ​ 1、该对象的属性是父类属性
// ​ 2、如果子类重写了父类的方法，则该对象使用子类方法；否则，使用父类方法

// 思考(原因)：多态、继承、方法重写
// 方法重写：static方法不存在方法重写，非static才存在且必须为public才被运行
// 如果存在： 父类 a=new 子类();
// 上述对象实际上是：父类引用指向子类
// 所以：a不能使用子类独有的方法、如果子类重写了父类方法，则使用子类方法；否则，使用父类方法
// a的成员变量即是父类的成员变量
