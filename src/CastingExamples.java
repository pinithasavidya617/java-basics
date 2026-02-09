public class CastingExamples { //Use pascal Naming Convention
    public static void main(String[] args) {
        castingDemo();
    }

    public static void castingDemo(){
        System.out.println("Hello World");

        byte byteAge = 30; //1 byte
        short shortAge = 26; // 2 byte

        //byte -> short -> int -> long -> Double === Handled by JVM
        shortAge = byteAge; //Implicit Casting

        int intValue = 2000;
        long longValue ;
        double doubleValue ;

        longValue = intValue; //Implicit casting int to long
        doubleValue = longValue;

        System.out.println(shortAge);
    }

    public static void explicitCasting(){
        double doubleVal = 22.3434;
    }
}
