package Day4;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        displaySum(sumNaturalNumbers(getNumber()));
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++ ){
            sum += i;
        }
        return sum;
    }

    public static void displaySum(int sum){
        System.out.println("Sum: " + sum);
    }
}
