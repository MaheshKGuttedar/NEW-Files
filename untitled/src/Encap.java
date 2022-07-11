public class Encap {
    public static void main(String[] args){

        Bank b = new Bank();
        System.out.println(b.money);
        b.money=100;
        System.out.println(b.money);


    }
}

class Bank{
    public int money =10000;

}
