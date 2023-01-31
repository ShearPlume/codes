class sample {
    int a = 2;
    int b = 3;
    double c = 1.0 * a / b;

    public static void main(String[] args) {
        String Sname[] = {"ss","dd"};
        int a=Sname.length
        String a = "e";
        for (int i = 0; i < 9; i++) {
            a += " o ";
        }
        System.out.println(String.format("%s", a));
    }

    // constructor2
public Team(String name, int goldNumber, int silverNumber, int bronzeNumber) {
    //constructor2 use Formal parameters to initialize the attributes
    this.name = name;
    this.numGold = goldNumber;
    this.SilverNumber = silverNumber;
    this.BronzeNumber = bronzeNumber;
       
   }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // numGold
    public int getGoldNumber() {
        return numGold;
    }

    public void setGoldNumber(int numGold) {
        this.numGold = numGold;
    }

    // SilverNumber
    public int getSilverNumber() {
        return SilverNumber;
    }

    public void setSilverNumber(int SilverNumber) {
        this.SilverNumber = SilverNumber;
    }

    // BronzeNumber
    public int getBronzeNumber() {
        return BronzeNumber;
    }

    public void setBronzeNumber(int BronzeNumber) {
        this.BronzeNumber = BronzeNumber;
    }
    public void print() {
        System.out.printf("%s......|...%d|....%d|...%d%n", name, numGold, numSilver, numBronze);
    }

}
