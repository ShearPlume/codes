package AP.week2;

public class Pettest {
    public static void main(String[] args) {
        Pet[] pets = new Pet[4];
        pets[0] = new Cat("Tom", 3,"british blue cat","blue","mom's arms");
        pets[1] = new Dog("Pickle", 5000);
        pets[2] = new Dog("Dogmeat", 20,"German Shepherd","brown","human skulls");
        pets[3]=new Pet("Jerry",3);

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].toString());
        }
        // pets[0].provideBone();
    }
}
