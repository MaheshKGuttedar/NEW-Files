public class Myclass {
    public static void main (String[] args){
        int x =10;
        Doctor d = new Doctor();
        System.out.println();
        System.out.println(x);
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.exp);


    }
}
class Doctor{
    public String name="Dr.mahesh";
    public int age=26;
    public int exp=5;
}
