package year;

import java.util.Scanner;

public class LeapYear {
    private int year;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ly = input.nextInt();
        LeapYear year = new LeapYear();
        year.printStatement(1);
        year.whichMonth(2);
        year.isLeapYear(2022);

    }

    private boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(year + " Is a leap year");
            return true;
        }
        System.out.print(year + " Is not a leap year");
        return false;
    }

    private void whichMonth(int month) {
        switch (month) {
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("August");
                break;
            }
            case 9: {
                System.out.println("September");
                break;
            }
            case 10: {
                System.out.println("October");
                break;
            }
            case 11: {
                System.out.println("November");
                break;
            }
            case 12: {
                System.out.println("December");
                break;
            }
            default:
                System.out.println("Out of range");
        }
    }

    private void printStatement(int number) {
        switch (number) {
            case 1:

                System.out.println("good");
                break;

            case 2:

                System.out.println("better");
                break;

            case 3:

                System.out.println("best");
                break;

            default:

                System.out.println("invalid");
                break;

        }
    }


}

