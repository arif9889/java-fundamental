package abstraction;

public abstract class Car {
    double price;
    String color;

    //abstrack method doesnt need body
    abstract void start();

    void displayNumberOfTyres() {
        System.out.println("Car have 4 tyers");
    }


}
