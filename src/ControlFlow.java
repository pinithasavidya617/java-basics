import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age - : ");
        int x = scanner.nextInt();
        System.out.println("Entered number = " + x);

        if (x > 50){
            System.out.println("You are an old man!");
        } else if (x > 18) {
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a child");
        }
    }
}

