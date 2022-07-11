package Interface;

interface Area
{
    public static final int length = 4,breadth = 8;
    public void getName();
    public void getNumberOfSides();
    public void getArea();
    public void getPerimeter();
}
class Rectangle implements Area
{
    public void getName()
    {
        System.out.println("The name of the Polygon is: Rectangle");
    }
    public void getNumberOfSides()
    {
        System.out.println("There are 4 sides in a Rectangle");
    }
    public void getArea()
    {
        System.out.println("The Area of Rectangle is: " +length*breadth);
    }
    public void getPerimeter()
    {
        System.out.println("The Perimeter of Rectangle is: " +2*(length + breadth));
    }
}
class Interface
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.getName();
        rectangle.getNumberOfSides();
        rectangle.getArea();
        rectangle.getPerimeter();
    }
}
