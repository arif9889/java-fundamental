package fundamentals;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("Hey! Good Morning");
//        System.out.println("1 " + "+" + "2  = ");
        /*
            Multiline command
            hehe
            haha
            hoho
         */
        int personAge = 64;
        int wifeAge = 60;

        System.out.println("Insert your Age :");
        personAge = input.nextInt();

        System.out.println(("Insert wife age"));
        wifeAge = input.nextInt();

        System.out.println(personAge);
        System.out.println(wifeAge);


        Main eligible = new Main();
        String result = eligible.eligibleCheck(personAge,wifeAge);
        System.out.println(result);
    }

    public String exerciseTwo() {
        int a = 55;
        int b = 25;

        if (a / 5 >= 10 && b / 5 >= 10) {
            return "both value greater than 10";
        }
        return "both value not greater than 10";
    }

    public int candy() {
        Candy candy = new Candy();
        int price = 250;
        candy.setPrice(price);
        int a = candy.getPrice();
        return a;
    }

    public String eligibleCheck(int personAge, int wifeAge) {
        int ageGap = Math.abs(personAge - wifeAge);

        if (personAge == 0 || wifeAge == 0 || personAge != Math.abs(personAge) || wifeAge != Math.abs(personAge)) {
            System.out.println("Data not valid");
            System.exit(0);
        }

        if (personAge >= 50 && wifeAge >= 40 && ageGap <= 2) {
         return "Eligible to get bounty prize";
        }
          return "Not eligible to get bounty prize";
    }
}


