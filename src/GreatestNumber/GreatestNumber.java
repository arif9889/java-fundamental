package GreatestNumber;

public class GreatestNumber {
    private int a, b, c;

    public static void main(String[] args) {

        GreatestNumber num = new GreatestNumber();
        num.greatestNum(1, 2, 3);
        num.greatestNum(2, 4, 1);
        num.greatestNum(5, 2, 1);
    }

    public void greatestNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is The greatest number");

        } else if (b > a && b > c) {
            System.out.println(b + " is the greatest number");

        } else if (c > a && c > b) {
            System.out.println(b + " is the greatest number");
        }
    }

//    public int greatestNum(int a, int b, int c) {
//        if (a > b && a > c) {
//            System.out.println(a + " is The greatest number");
//            return a;
//        } else if (b > c) {
//            System.out.println(b + " is the greatest number");
//            return b;
//        } else  {
//            System.out.println(b + " is the greatest number");
//            return c;
//        }
//    }
}
