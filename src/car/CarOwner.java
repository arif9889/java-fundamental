package car;

public class CarOwner {
    public static void main(String[] args) {
        Car car = new Car();
        SportsCar sportCar = new SportsCar();
        car.drive(20);
        sportCar.drive(20);
    }
}
