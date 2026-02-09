public class Main {
    public static void test() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        test(); //Calling method test

        //Primitive Data Types
        byte byteSizeNumber = 12;
        short shortSizeNumber = 200;
        int largeNumber = 502505050;
        long verLargeNumber = 2525215252525141552L;

        System.out.println(byteSizeNumber);
        System.out.println(shortSizeNumber);
        System.out.println(largeNumber);
        System.out.println(verLargeNumber);

        //Decimal Primitive datatypes
        float floatingDecimalNumber = 2.34f;
        double preciseDecimalNumber = 3.23232255145555455855665566;

        boolean isHoliday = false;
        char singleCharacter = 'A';

        System.out.println(floatingDecimalNumber);
        System.out.println(preciseDecimalNumber);

        System.out.println(isHoliday);
        System.out.println(singleCharacter);

        String instituteName = "C-Clarke";
        System.out.println(instituteName);


        //Arithmetic operators
        int x = 102;
        int y = 33;

        System.out.println("Addition Operation - " + (x + y));
        System.out.println("Subtraction Operation - " + ( x - y));
        System.out.println("Multiplication Operation - " + (x * y));
        System.out.println("Divide Operation - " + (x / y));
        System.out.println("Modulus Operation - " + (x % y));

        //Comparison operator
        System.out.println("Greater than " + (x > y));
        System.out.println("Less than " + (x < y));
        System.out.println("Equal than " + (x == y));
        System.out.println("Not equal operator " + (x != y));

        //logical operators
        boolean firstCondition = true;
        boolean secondCondition = true;

        System.out.println("AND Operator " + (firstCondition && secondCondition));
        System.out.println("OR Operator " + (firstCondition || secondCondition));
        System.out.println("NOT Operator " + !firstCondition);

        //increment/decrement operators
        int val  = 5;
        int val2 = 10;

        System.out.println("Pre Increment " + ++val);
        System.out.println("Pre Decrement " + --val2);

        int val3  = 15;
        int val4 = 20;

        System.out.println("Post Increment " + val3++);
        System.out.println("Post Decrement " + val4--);

        System.out.println(val3);
        System.out.println(val4);

    }
}