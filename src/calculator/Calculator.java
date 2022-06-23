package calculator;

public class Calculator {
    private String name, color;
    private int weight, price;

    public Calculator() {
        System.out.print("Constructor Called");
    }

    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int calculateCube(int a) {
        int result = a * a * a;
        return result;
    }

    public double calculateInterest(int principle, double rate, int time) {
        double result = (principle * rate * time)/100;
        return result;
    }


}
