package Online_OOP_Tasks_W3._3;

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(15,10);
        System.out.println("The rectangle perimeter is " + r1.calculatePerimeter() + " and surface is " + r1.calculateSurface()
         + ".");
        r1.setHeight(100);
        r1.setWidth(200);
        System.out.println("The rectangle perimeter is now " + r1.calculatePerimeter() + " and surface is now "
                + r1.calculateSurface() + ".");
    }
}
