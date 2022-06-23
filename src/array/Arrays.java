package array;

import java.util.Scanner;

public class Arrays {
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        int myArray[] = new int[]{10, 20, 30, 40, 50};
//
//        for (int i = myArray.length - 1; i >= 0; i--) {
//            System.out.println(myArray[i]);
//        }
        Arrays array = new Arrays();
        array.averageInput();
    }

    void averageInput() {
        System.out.println("Enter number of element : ");
        int element = input.nextInt();

        int[] array = new int[element];
        int sum = 0;
        int temp = 0;

        //Looping for get user input and calculate it
        for (int i = 0; i < element; i++) {
            System.out.println("Insert " + i + " Number = ");
            array[i] = input.nextInt();
            sum += array[i];
        }


        //Print all the element
        for (int i = 0; i < element; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }

        //Print average
        System.out.println("Average : " + (double) sum / element);

        //Find number in array
        System.out.println("Enter the number : ");
        int findNumber = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNumber) {
                System.out.println("Number is in index " + i);
            } else if (array[i] != findNumber) {
                System.out.println();
            } else {
                System.out.println("Number not found");
            }
        }
    }

    void tryCatch() {
        //try and finally without catch

        try {
            int arr[] = new int[2];
            arr[7] = 8;

        } catch (NullPointerException ex) {
            System.out.println("ArrayIndextOutOfBoundsException");
        } finally {
            System.out.println("Finally process reached here");
        }
    }


}
