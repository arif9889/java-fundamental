package looping;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        ForLoop kali = new ForLoop();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int number = input.nextInt();

//        kali.multiply(number);
//        nestedForOne();
//        nestedForTwo();
//        pyramid();
//        forEach();
//        tryWhile(number);
         secondPyramid();


        //if we change the method to static
        // we can call the function directly
        //multiply(num)


/*        for (int i=1;i<=10;i++){
            System.out.println("Natural number = " + i);
            sum += i;
            System.out.println("Sum = " + sum);
        }
        System.out.println("Sum Total = " + sum);
*/

    }

    public void multiply(int number) {
        if (number > 0) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + "*" + i + " = " + (number * i));
            }
        } else {
            System.out.println("Invalid number");
        }
    }

    static void nestedForOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i =" + i + " j = " + j);
            }
        }
    }

    static void nestedForTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.println("i =" + i + " j = " + j);
            }
        }
    }

    static void pyramid() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void forEach() {
        int arr[] = {11, 24, 51, 22, 56};
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void tryWhile(int number) {
        int i = 1;
        while (i <= 10) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
            i++;
        }
    }

    static void secondPyramid() {
        for(int i = 5; i<=5; i--) {
            for(int j=5; j<= i; j--) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }

}
