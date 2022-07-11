package Interface;
interface Algorithms
{
    int a = 50;
    int b = 30;
    void add();
    void sub();
    void multi();
    void  div();
}

class calculator implements Algorithms{

    @Override
    public void add() {
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));

    }

    @Override
    public void sub() {
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));

    }

    @Override
    public void multi() {
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));

    }

    @Override
    public void div() {
        System.out.println("divisions of "+a+" and "+b+" is: "+(a/b));

    }

    public static void main(String[] args) {
        calculator C = new calculator();
        C.add();
        C.sub();
        C.multi();
        C.div();

    }
}
