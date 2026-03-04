package Day3;

import java.util.Scanner;

public class PositiveInput {
    public static void main(String[] args) {
        check();
    }

    private static void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num  <= 0){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        System.out.println("Positive");
    }
}
