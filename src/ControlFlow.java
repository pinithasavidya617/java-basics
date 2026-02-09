import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        ageIdentifier();
        controlFlowExamples();

        //For loop
        for(int i = 0; i <= 10; i++){
            System.out.println("Hello World");
        }
    }

    private static void ageIdentifier() {
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

    private static void controlFlowExamples() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark - : ");
        int mark = sc.nextInt();
        String grade;

        if (mark >= 80) {
            grade = "Grade A";
        } else if (mark >= 60) {
            grade = "Grade B";
        } else if (mark >= 40) {
            grade = "Grade C";
        } else {
            grade = "Fail";
        }

        System.out.println("Your grade is: " + grade);

        switch (grade){
            case "Grade A" :
                System.out.println("Congrats you got a chocolate box");
                break;
            case "Grade B" :
                System.out.println("Congrats you got a choco bar");
                break;
            case "Grade C" :
                System.out.println("Study hard... wont give you anything");
                break;
            case "Fail":
                System.out.println("Try something different!");
                break;
            default:
                System.out.println("Unexpected Grade Value");
        }



    }
}

