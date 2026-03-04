import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
//        pattern();
//        pattern2();
//        pattern3();
        userPattern();
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

        System.out.println("How many columns? ");
        int columns = scanner.nextInt();

        for(int i = 1; i <= rows; i ++){     //rows
            for ( int j = 1; j <= columns; j++){  // columns
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
