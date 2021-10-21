package HomeWork2;

public class ArithmeticOperatorsDataTypes {
    public static void main(String[] args) {

        int A = 20;
        int B = 35;
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
        System.out.println(A + 1);
        System.out.println(1 + A);
        System.out.println(A - 1);



    /*
    BYTE:
    Range:-128 to 127
    Memory: 1 bytes= 8
     */
        byte b = -120;
        byte b1 = -122;

        System.out.println(b + b1);

         /*
         short:
         Range: -32768 to 32767
         Memory: 2 bytes = 16 bits
          */
        short s = 30000;
        short s1 = 2000;
        System.out.println(s - s1);

        /*
        INTEGER:
        Range: quite high
        Memory: 4 bytes = 32 bits
         */

        int i = 50;
        int ii = 5;
        System.out.println(i / ii);

        /*
        LONG:
        Range: really high
        Memory: 8 bytes = 64 bits
         */

        long l = 200000;
        System.out.println(l);

        /*
        FLOAT:
        Memory: 4 bytes = 32bits
        Range:- quite high less than double
         */

        float f = 10.25f;
        float f1 = (float) 10.15;
        System.out.println(f - f1);

        /*
        Double:
        Memory: 8 bytes = 64bits
        Range - up to 15 decimal places roughly
         */
        double d = 15.25;
        double d1 = 14.25;
        System.out.println(d - d1);

        /*
        CHARACTER (Single values - unicode values)
        memory: 2 bytes = 16 bits
         */

        char c1 = '5';
        char c2 = '6';
        char c3 = '8';
        System.out.println(c1 * c2 * c3);
        System.out.println(c1 % c2);

        /*
        BOOLEAN:
        Memory: less than 1 bit
        Range:true or false
         */
        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b2);

        /*
        STRING: Default class available in Java.
        - Any text any length
         */
        String s2 = "Hetal";
        String s3 = "Nayi";
        String s4 = "Birthday";
        System.out.println(s2 + s3);


    }
}

