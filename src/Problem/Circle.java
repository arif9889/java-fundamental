package Problem;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of circle" + result);
    }

    @Override
    public void perimeter() {
        double result = 2 * Math.PI * radius;
        System.out.println("perimeter of circle" + result);
    }
}
