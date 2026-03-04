package Day3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        lessThanTen();
//        positiveNum();
        reverse();
    }

    private  static void lessThanTen(){
        int i = 0;
        do {
            System.out.println(i);
            i ++;
        } while (i <= 10);
    }

    private static void positiveNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }while (num <= 0);
    }

    private static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int reverse = 0;
        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }while (num != 0);
        System.out.println(reverse);

    }

}
