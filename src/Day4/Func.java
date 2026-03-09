package Day4;

public class Func {
    public static void main(String[] args) {
        sum(4, 6);
        System.out.println(multiply(4, 5));

//        multiply(4, 6);
    }

    public static void sum(int a, int b){
        int tot = a + b;
        System.out.println(tot);
    }

    public static int multiply(int a, int b){
        return a * b;
    }


}
