
class AlphName {
    public static void main(String[] args) {
        int n = 0;
        String Sname[] = {"Thomas", "Amaya", "Gustavo", "Melina", "Reirse", "Bell"};
        n=Sname.length;
        String temp;
        for (int i = 0; i < n;i++) 
        {
            for (int k = i; k < n; k++) {
                if (Sname[i].compareTo(Sname[k]) >0{
                temp = Sname[i];
                Sname[i] = Sname[k];
                Sname[k] = temp;
                }
                }
        }    
        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < n; i++) {
        System.out.println(Sname[i]);
        }  

}
}