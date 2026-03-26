package WideningTypeCasting;

class WideningTypeCasting {

    public static void main(String[] args) {

        System.out.println("Byte:");
        byte byteNum = 100;

        short a = byteNum;
        System.out.println(a);

        int b = byteNum;
        System.out.println(b);

        long c = byteNum;
        System.out.println(c);

        float d = byteNum;
        System.out.println(d);

        double e = byteNum;
        System.out.println(e);

        // char f = byteNum;
        // System.out.println(f);
        System.out.println("Short:");
        short shortNum = 100;

        int a1 = shortNum;
        System.out.println(a1);

        long b1 = shortNum;
        System.out.println(b1);

        float c1 = shortNum;
        System.out.println(c1);

        double d1 = shortNum;
        System.out.println(d1);

        // char e1 = shortNum;
        // System.out.println(e1);
        System.out.println("Integer:");
        int intNum = 1000;

        long a2 = intNum;
        System.out.println(a2);

        float b2 = intNum;
        System.out.println(b2);

        double c2 = intNum;
        System.out.println(c2);

        System.out.println("Long:");
        long longNum = 10000l;

        float a3 = longNum;
        System.out.println(a3);

        double b3 = longNum;
        System.out.println(b3);

        System.out.println("float:");
        float floatNum = 100000.98f;

        double a4 = floatNum;
        System.out.println(a4);

    }
}
