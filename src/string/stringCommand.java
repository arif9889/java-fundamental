package string;

import java.util.Scanner;

// TODO: Write a program to take “I LOVE MY COUNTRY” as input :
//      a.Remove vowels from a String calculate total length of new String.
//      b.Convert all characters to lowercase letters.
public class stringCommand {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Make a sentence : ");
        String string = input.nextLine();

        String updatedString = string.replaceAll("[AaIiUuEeOo]", "");
        System.out.println(updatedString);

        System.out.println("String lenght after vowels remove : " + updatedString.length());
        System.out.println(string.toLowerCase());
    }


}
