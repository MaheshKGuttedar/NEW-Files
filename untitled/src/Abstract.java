public class Abstract {
}
abstract  class Bike{
    abstract  void run();
}
class honda extends Bike {
    void run(){
        System.out.println("running  safely");
    }
 public  static void  main(String[] args){
        Bike obj = new honda();
        obj.run();
 }
}