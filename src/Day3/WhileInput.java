package Day3;

import java.util.Scanner;

public class WhileInput {
    public static void main(String[] args) {
        number();

    }
    private static void number (){
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter 0 to stop");

        number = sc.nextInt();

        while (number != 0){
            System.out.println("You entered: " + number);
            number = sc.nextInt();

        }

        System.out.println("loop Ended");
    }

}
