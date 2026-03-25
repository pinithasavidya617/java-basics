package Day6;

public class ListAssignment {

    public static void main(String[] args) {

        int[] array = {4,7,8,10,40,20};
        int sum_value;
        sum_value = sum(array);
        System.out.println(sum_value);

    }

    public static int sum(int [] marks ){

        int sum = 0 ;

        for(int i = 0;  i < marks.length ; i ++){

            sum += marks[i];
        }
        return sum;
    }
}