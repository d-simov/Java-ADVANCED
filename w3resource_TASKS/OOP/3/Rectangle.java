package Online_OOP_Tasks_W3._3;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width is now set to " + this.width);
        }
        else {
            this.width = 10;
            System.out.println("Width is now set to " + this.width);
        }
        if (height > 0) {
            this.height = height;
            System.out.println("Height is now set to " + this.height);
        }
        else {
            this.height = 5;
            System.out.println("Height is now set to " + this.height);
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width is now set to " + this.width);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height is now set to " + this.height);
        }
    }

    int calculatePerimeter () {
        return height * 2 + width * 2;
    }

    int calculateSurface () {
        return width * height;
    }
}
