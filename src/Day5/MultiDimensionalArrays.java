package Day5;

public class MultiDimensionalArrays {

    // Example 1: Basic 2D Array Operations
    public static void basic2DArray() {
        // Method 1: Declaration and allocation
        int[][] matrix = new int[3][3];

        // Fill with values
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }

        // Display matrix
        System.out.println("3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example 2: Matrix Operations
    public static void matrixOperations() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Matrix Addition
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example 3: Jagged Arrays (Different column sizes)
    public static void jaggedArray() {
        int[][] jagged = new int[4][];

        // Initialize with different column sizes
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];
        jagged[3] = new int[4];

        // Fill with values
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = j + 1;
            }
        }

        // Display jagged array
        System.out.println("Jagged Array (Triangle Pattern):");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example 4: Real-world - Student marks across subjects
    public static void studentMarksMatrix() {
        // Rows: Students, Columns: Subjects
        int[][] marks = {
                {85, 90, 78, 92},  // Student 1: Math, Science, English, CS
                {75, 82, 91, 88},  // Student 2
                {95, 85, 79, 96},  // Student 3
                {68, 72, 84, 71}   // Student 4
        };

        String[] subjects = {"Math", "Science", "English", "CS"};

        // Calculate average per subject
        System.out.println("Subject Averages:");
        for (int j = 0; j < subjects.length; j++) {
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i][j];
            }
            System.out.println(subjects[j] + ": " + (double)sum / marks.length);
        }

        // Calculate total per student
        System.out.println("\nStudent Totals:");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Student " + (i+1) + ": " + total);
        }
    }

    public static void main(String[] args) {
        basic2DArray();
        System.out.println();
        matrixOperations();
        System.out.println();
        jaggedArray();
        System.out.println();
        studentMarksMatrix();
    }
}
