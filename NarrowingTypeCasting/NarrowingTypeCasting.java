package NarrowingTypeCasting;

public class NarrowingTypeCasting {

    public static void main(String[] args) {
        System.out.println("Narrowing Type Casting");

        System.out.println("Double:");
        double doubleNum = 100.21D;
        float a = (float) doubleNum;
        System.out.println(a);

        long b = (long) doubleNum;
        System.out.println(b);

        int c = (int) doubleNum;
        System.out.println(c);

        short d = (short) doubleNum;
        System.out.println(d);

        char e = (char) doubleNum;
        System.out.println(e);

        short f = (short) doubleNum;
        System.out.println(f);

        byte g = (byte) doubleNum;
        System.out.println(g);

        System.out.println("Float:");
        float floatNum = 100.21f;

        long a1 = (long) floatNum;
        System.out.println(a1);

        int b1 = (int) floatNum;
        System.out.println(b1);

        char c1 = (char) floatNum;
        System.out.println(c1);

        short d1 = (short) floatNum;
        System.out.println(d1);

        byte e1 = (byte) floatNum;
        System.out.println(e1);

        System.out.println("Integer:");
        int intNum = 100;

        char a2 = (char) intNum;
        System.out.println(a2);

        short b2 = (short) intNum;
        System.out.println(b2);

        byte c2 = (byte) intNum;
        System.out.println(c2);

        System.out.println("Long:");
        long longNum = 100l;

        int a3 = (int) longNum;
        System.out.println(a3);

        short b3 = (short) longNum;
        System.out.println(b3);

        char c3 = (char) longNum;
        System.out.println(c3);

        byte d3 = (byte) longNum;
        System.out.println(d3);

        System.out.println("Short:");
        short shortNum = 100;

        byte a4 = (byte) shortNum;
        System.out.println(a4);

        System.out.println("Char:");
        char charNum = 'a';

        short a5 = (short) charNum;
        System.out.println(a5);

        byte b5 = (byte) charNum;
        System.out.println(b5);
    }
}
