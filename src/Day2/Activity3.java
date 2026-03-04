package Day2;

public class Activity3 {
    public static void main(String[] args) {
        loop();
    }

    private static void loop(){
        System.out.println("\nDay2.Activity 1\n");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\nDay2.Activity 2\n");
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("\nDay2.Activity 3\n");
        for(int i = 0; i <= 20; i+=2){
            System.out.println(i);
        }

        System.out.println("\nDay2.Activity 4\n");
        int num = 5;
        for(int i = 1; i <= 12; i++){
            System.out.println("5 * " + i + " = " + (num * i));
        }

        System.out.println("\nDay2.Activity 5\n");
        int sum = 0;
        for(int i = 0; i <= 100; i+=1){
            sum += i;
        }
        System.out.println("Sum = " + sum);


    }
}
