package grading;

public class Main {
    public static void main(String[] args) {
        Main grade = new Main();

        String result = grade.grading(85);
        System.out.println("Your grade is " + result);
    }

    public String grading(int marks) {
        if (marks >= 50 && marks <= 60) {
            return "D";
        } else if (marks >= 60 && marks <= 70) {
            return "C";
        } else if (marks >= 70 && marks <= 80) {
            return "B";
        } else if (marks >= 80 && marks <= 90) {
            return "A";
        } else if (marks >= 90 && marks <= 100) {
            return "A+";
        }
        return "Fail";
    }
}
