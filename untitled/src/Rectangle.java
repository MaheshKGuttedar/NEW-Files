public class Rectangle {
    private  int length;
    private   int breadth;

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length=length;
//        if(length>0){
//            this.length =length;
//        }
//        else{
//            this.length=0;
//        }

    }

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public  int getArea(){
         return  this.breadth * this.length;
    }

    public  int getPerimeter(){
        return this.breadth+this.length + this.breadth+this.length;


    }
    public void calculate() {
        System.out.println("length of the Rectangle will be :- " + this.length);
        System.out.println("breadth of the Rectangle will be :- " + this.breadth);
        System.out.println("Total area of Rectangle is :- " + getArea());
        System.out.println("Total perimeter of Rectangle is :- " + getPerimeter());
    }
}

class Test{
    public  static void  main(String[] args){
        Rectangle r = new Rectangle();
        r.setLength(2);
        r.setBreadth(5);
        r.calculate();
    }
}


