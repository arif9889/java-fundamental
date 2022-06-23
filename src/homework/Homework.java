package homework;

import java.util.Scanner;

public class Homework {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the character : ");
        char character = input.next().charAt(0);
        characterCheck(character);

        System.out.print("Input the length : ");
        int height = input.nextInt();
        pyramid(height);

    }

    static void characterCheck(char character) {

        if (Character.isUpperCase(character)) {
            System.out.println(character + " is uppercase");
        } else {
            System.out.println(character + " is lowercase");
        }

    }

    static void pyramid(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

