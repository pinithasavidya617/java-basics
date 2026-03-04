package Day2;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter operator: ");
        String operator = scanner.next();

        int answer;

        switch (operator){
            case "+":
                answer = num1 + num2;
                System.out.println(answer);
                break;
            case "-":
                answer = num2 - num1;
                System.out.println(answer);
                break;
            case "*":
                answer = num2 * num1;
                System.out.println(answer);
                break;
            case "/":
                answer = num2 / num1;
                System.out.println(answer);
                break;
            default:
                System.out.println("Unexpected Value");

        }



    }


}
