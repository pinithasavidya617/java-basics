package Day4;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        int firstNum = getFirstNumber();
        int secondNum = getSecondNumber();
        int thirdNum = getThirdNumber();
        displayResult(findMaximum(firstNum, secondNum, thirdNum));

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


    public static int getThirdNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter third num: ");
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c){
        int max = 0;
        if (a > b) {
            max = a;
        }else {
            max = b;
        }
        if (c > max){
            max = c;
        }

        return max;

    }

    public static void displayResult(int max){
        System.out.println("Max: " + max);
    }
}
