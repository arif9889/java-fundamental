package Problem;

//TODO: Create a Shape interface having methods area () and perimeter ().
//      Create 2 subclasses, Circle and Rectangle that implement the Shape interface.
//      Create a class Sample with main method and demonstrate the area and perimeters of both the shape classes.
//      You need to handle the values of length, breath, and radius in respective classes to calculate their area and perimeter.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.perimeter();

        Circle circle = new Circle();
        circle.area();
        circle.perimeter();

    }
}
