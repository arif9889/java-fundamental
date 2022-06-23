package car;

public class Car {
    private String color;
    private String name;

    private int numberOfSeats;

    public Car() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void start() {

    }

    public void stop() {

    }

    public int drive(int time) {
        int distance = time * 60;
        System.out.println("Car distance : " + distance);
        return distance;
    }
}