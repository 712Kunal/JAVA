
class IncreDecre {

    public static void main(String[] args) {
        int p = -3, q = 8, r = -13, s;

        p = r++ + p++ - --r;
        s = q-- * p;
        q = q++;
        r = r + p++ - --q + s++;

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
