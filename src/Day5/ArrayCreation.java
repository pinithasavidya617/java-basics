package Day5;

public class ArrayCreation {
    public static void main(String[] args) {

        // Method 1: Declare and allocate memory (default values)
        int[] numbers = new int[5];
        // Default values: [0, 0, 0, 0, 0]

        // Method 2: Declare and initialize with values
        int[] scores = {95, 87, 92, 78, 88};
        // Length automatically determined: 5 elements

        // Method 3: Declare, allocate, then assign
        int[] ages = new int[3];
        ages[0] = 25;
        ages[1] = 30;
        ages[2] = 22;

        // Print arrays
        System.out.println("Numbers array length: " + numbers.length);
        System.out.println("First score: " + scores[0]);
        System.out.println("Second age: " + ages[1]);
    }
}
