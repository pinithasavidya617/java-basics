package Day4;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        int firstNum = getFirstNumber();
        int secondNum = getSecondNumber();
        displayResult(findMaximum(firstNum, secondNum));

    }

    public static int getFirstNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        return sc.nextInt();
    }

    public static int getSecondNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter second num: ");
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b){
        if (a > b){
            return a;
        }else
            return b;

    }

    public static void displayResult(int max){
        System.out.println("Max: " + max);
    }
}
