package Day2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
//        ages();
        PositiveNum();
//        grades();
    }

    private static void grades(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int mark = scanner.nextInt();

        String grade;

        if (mark >= 80) {
            grade = "Grade A";
        } else if (mark >= 60) {
            grade = "Grade B";
        } else if (mark >= 40) {
            grade = "Grade C";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);
    }

    private static void ages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        String category;
        if (age >= 60) {
            category = "Senior";
        } else if (age >= 18) {
            category = "Adult";
        } else if (age >= 13) {
            category = "Teenager";
        } else {
            category = "Child";
        }

        System.out.println("You are :" + category);
    }

    private static void PositiveNum(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number-: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Positive");
        }else if(number == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }

    }
}
