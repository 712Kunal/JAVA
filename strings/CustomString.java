package strings;

public class CustomString {
    private char[] values;

    public CustomString() {
        values = new char[0];
    }

    public CustomString(char[] ch) {
        values = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            values[i] = ch[i];
        }
    }

    public CustomString(String s) {
        char ch[] = s.toCharArray();
        values = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            values[i] = ch[i];
        }
    }

    public String toString() {
        char[] res = new char[values.length];

        for (int i = 0; i < values.length; i++) {
            res[i] = values[i];
        }

        return new String(res);
    }

    public int length() {
        return values.length;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    public char[] toCharArray() {
        return values;
    }

    public char charAt(int index) {
        if (index >= values.length) {
            throw new StringIndexOutOfBoundsException(index + " is out of bound");
        }

        return values[index];
    }

    public String toUpperCase() {
        char[] res = new char[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 97 && values[i] <= 122) {
                res[i] = (char) (values[i] - 32);
            } else {
                res[i] = values[i];
            }
        }

        return new String(res);
    }

    public String toLowerCase() {
        char[] res = new char[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 65 && values[i] <= 90) {
                res[i] = (char) (values[i] + 32);
            } else {
                res[i] = values[i];
            }
        }

        return new String(res);
    }

    public int indexOf(char ch, int fromIndex) {
        for (int i = fromIndex; i < values.length; i++) {
            if (values[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(char ch, int fromIndex) {
        for (int i = fromIndex; i >= 0; i--) {
            if (values[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(char ch) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    public String replace(char oldChar, char newChar) {
        char[] res = new char[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] == oldChar) {
                res[i] = newChar;
            } else {
                res[i] = values[i];
            }
        }

        return new String(res);
    }

    public boolean startsWith(String prefix) {
        if (prefix.length() > values.length) {
            return false;
        }

        char[] ch = prefix.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != values[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean endsWith(String suffix) {
        if (suffix.length() > values.length) {
            return false;
        }

        char[] ch = suffix.toCharArray();
        int startIndex = values.length - suffix.length();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != values[i + startIndex]) {
                return false;
            }
        }

        return true;
    }

    public CustomString concat(String str) {
        if (str.isEmpty()) {
            return this;
        }

        char[] ch = str.toCharArray();
        char[] res = new char[ch.length + values.length];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            res[index] = values[i];
            index++;
        }

        for (int i = 0; i < ch.length; i++) {
            res[index] = ch[i];
            index++;
        }

        return new CustomString(res);
    }

    public static void main(String[] args) {
        char[] ch = {'j', 'a', 'v', 'a'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = new String("java");
        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println("Is Empty?: " + s1.isEmpty());

        char[] ch1 = s1.toCharArray();
        System.out.println(ch1);

        System.out.println("Charcter at index 2: " + s1.charAt(2));

        String s2 = s1.toUpperCase();
        System.out.println("TO upper Case: " + s2);

        String s3 = new String("JAVASCRIPT");
        System.out.println("To lower Case: " + s3.toLowerCase());

        System.out.println(s1.indexOf('a', 1));

        System.out.println(s1.indexOf('a'));

        System.out.println(s1.lastIndexOf('a', 2));

        System.out.println(s1.lastIndexOf('a'));

        String s4 = s1.replace('a', '@');
        System.out.println(s4);

        System.out.println(s1.startsWith("ja"));

        System.out.println(s1.endsWith("ja"));

        String s5 = s1.concat("Script is a programming language");
        System.out.println(s5);

        System.out.println("======================================================================");

        char[] ch2 = {'j', 'a', 'v', 'a'};
        CustomString cs = new CustomString(ch2);
        System.out.println(cs);
        System.out.println("Using toString Method: " + cs.toString());

        CustomString cs1 = new CustomString("java");
        System.out.println(cs1);

        System.out.println(cs1.length());

        System.out.println("Is Empty?: " + cs1.isEmpty());

        char[] ch3 = cs1.toCharArray();
        System.out.println(ch3);

        System.out.println("Charcter at index 2: " + cs1.charAt(2));

        String cs2 = cs1.toUpperCase();
        System.out.println("TO upper Case: " + cs2);

        CustomString cs3 = new CustomString("JAVASCRIPT");
        System.out.println("To lower Case: " + cs3.toLowerCase());

        System.out.println(cs1.indexOf('a', 1));

        System.out.println(cs1.indexOf('a'));

        System.out.println(cs1.lastIndexOf('a', 2));

        System.out.println(cs1.lastIndexOf('a'));

        String cs4 = cs1.replace('a', '@');
        System.out.println(cs4);

        System.out.println(cs1.startsWith("ja"));

        System.out.println(cs1.endsWith("ja"));

        CustomString cs5 = cs1.concat("Script is a programming language");
        System.out.println(cs5);
    }
}
