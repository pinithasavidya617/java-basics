package Day3;

public class NestedWhile {
    public static void main(String[] args) {
//        repeatedNumbers();
        multiplicationTable();
    }
    private static void repeatedNumbers() {
        int i = 0;
        while (i <= 5){
            int j = 0;
            while (j <= i){
                System.out.print(i);
                j ++;
            }
            System.out.println();
            i++;
        }
    }

    private static void multiplicationTable(){
        int i = 1;
        while (i <= 12){
            int j = 0;
            while (j <= 12){
                System.out.println(i + " x " + j + " = " + (i * j));
                j ++;
            }
            i ++;
        }
    }
}
