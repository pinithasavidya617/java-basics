package Day3;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
//        pattern();
//        pattern2();
//        pattern3();
//        userPattern();
//        pyramid();
//        invertedPyramid();
        diamond();
    }


    private static void pattern(){
        for(int i = 1; i <= 5; i ++){     //rows
            for (int j = 1; j <= 5; j++){  // columns
                System.out.print("*");
            }
            System.out.println();

        }

    }

    private static void pattern2(){
        for(int i = 1; i <= 5; i ++){     //rows
            for (int j = 1; j <= i; j++){  // columns
                System.out.print("*");
            }
            System.out.println();

        }

    }

    private static void pattern3(){
        for(int i = 5; i >= 1; i --){     //rows
            for (int j = 1; j <= i; j++){  // columns
                System.out.print("*");
            }
            System.out.println();

        }

    }

    private static void userPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows? ");
        int rows = scanner.nextInt();

//        System.out.println("How many columns? ");
//        int columns = scanner.nextInt();

        for(int i = 0; i <= rows; i ++){     //rows
            for ( int j = 0; j <= i; j++){  // columns
                System.out.print("*");
            }
            System.out.println();

        }

        scanner.close();

    }

    public static void pyramid(){
        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedPyramid(){

        for(int i = 5; i >= 1; i--) {

            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void diamond() {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n-1; i >= 1; i--) {

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}



