package calculator;

public class Main {

    public static void main(String[] args) {
        //Make a new object
        Calculator cal = new Calculator();
        //Constructor will be execute after object created
        cal.setName("Mike");
        System.out.println(cal.getName());

        cal.sum(4,5);
        int cubeResult = cal.calculateCube(5);
        System.out.println(cubeResult);

        double interestResult = cal.calculateInterest(10000000, 0.15 ,2);
        System.out.println(interestResult);
    }
}
