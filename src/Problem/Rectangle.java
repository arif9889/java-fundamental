package Problem;

public class Rectangle implements Shape {
    double length,width;

    public Rectangle() {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println(result);
    }

    @Override
    public void perimeter() {
        double result = 2 * (length + width);
        System.out.println(result);
    }

}
