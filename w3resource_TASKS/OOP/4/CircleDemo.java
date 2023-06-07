package Online_OOP_Tasks_W3._4;

public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        System.out.printf("The circle's perimeter is %.2f.\n", c1.calculatePerimeter());
        System.out.printf("The circle's surface is %.2f. \n\n", c1.calculateSurface());
        c1.setRadius(10);
        System.out.printf("\nThe circle's perimeter is now " + c1.calculatePerimeter() + ".");
        System.out.printf("The circle's surface is now " + c1.calculateSurface() + ".\n");
        c1.setRadius(0);
        System.out.printf("\nThe circle's perimeter is " + c1.calculatePerimeter() + ".");
        System.out.printf("The circle's surface is " + c1.calculateSurface() + ".\n");
    }

}
