package Day3;

public class WhileActivity1 {
    public static void main(String[] args) {
        total();

    }

    private static void total(){
        int i = 1;
        int sum = 0;

        while (i <= 50){
            sum += i;
            i ++;
        }
        System.out.println(sum);
    }
}
