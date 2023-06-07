package Online_OOP_Tasks_W3._4;

public class Circle {

    private double radius;
    private double perimeter;
    private double surface;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("A circle is created with radius: " + this.radius + ".");
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("The circle's radius is now " + this.radius + ".");
            return;
        }
        System.out.println("Entered a negative number or zero. The circle's radius is still " + this.radius + ".");
    }

    double calculatePerimeter () {
        return radius * 2 * Math.PI;
    }

    double calculateSurface () {
        return radius * radius * Math.PI;
    }
}
