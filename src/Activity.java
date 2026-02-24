import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
//        marks();
//        vote();
//        purchase();
        PositiveNum();
//        EvenOrOdd();
    }

    private static void marks(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark-: ");
        int mark = scanner.nextInt();

        if (mark >= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }

    private static void vote(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age-: ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

    }

    private static void EvenOrOdd(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number-: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

    private static void PositiveNum(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number-: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative or Zero");
        }

    }

    private static void purchase(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount-: ");
        int amount = scanner.nextInt();

        if (amount > 5000){
            System.out.println("Discount Applied");
        }else{
            System.out.println("No Discount");
        }

    }


}
