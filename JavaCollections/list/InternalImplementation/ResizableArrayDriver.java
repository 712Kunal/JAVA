package JavaCollections.list.InternalImplementation;

import java.util.Arrays;

public class ResizableArrayDriver {
    public static void main(String[] args) {
        ResizableArray r1 = new ResizableArray();
        r1.add(10);
        r1.add(20);
        r1.add(30);
        r1.add(40);
        r1.add("hello");
        r1.add(true);
        r1.add(70);
        r1.add(80);
        r1.add(90);
        r1.add(100);

        r1.add(110);

        System.out.println(r1); // [10, 20, 30, 40, hello, true, 70, 80, 90, 100, 110]

        System.out.println(r1.indexOf(10)); // 0
        System.out.println(r1.contains(10)); // true
        System.out.println(r1.indexOf(120)); // -1
        System.out.println(r1.contains(120)); // false

        ResizableArray r2 = new ResizableArray();
        r2.add(1);
        r2.add(2);
        r2.add(3);
        r2.add(4);

        r1.addAll(r2);
        System.out.println(r1); // [10, 20, 30, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4]
        System.out.println(r1.isEmpty()); // false

        ResizableArray r3 = new ResizableArray();
        r3.add("a");
        r3.add("b");
        r3.add("c");
        r3.add("d");
        System.out.println(r3); // [a, b, c, d]
        r3.clear();
        System.out.println(r3); // []
        System.out.println(r3.isEmpty()); // true

        Object[] convertedArray = r2.toArray();
        System.out.println(Arrays.toString(convertedArray)); // [1, 2, 3, 4]

        System.out.println(r1.remove(0)); // 10
        System.out.println(r1); // [20, 30, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4]

        r1.remove((Integer) 20);
        System.out.println(r1); // [30, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4]

        r1.add(0, "hello world");
        System.out.println(r1); // [hello world, 30, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4]
        r1.add(r1.getSize(), "hello java");
        System.out.println(r1); // [hello world, 30, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4, hello java]
        r1.add(2, "hello js");
        System.out.println(r1); // [hello world, 30, hello js, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4, hello java]

        r1.addFirst(true);
        System.out.println(r1); // [hello world, 30, hello js, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4, hello java]

        r1.addLast(false);
        System.out.println(r1); // [true, hello world, 30, hello js, 40, hello, true, 70, 80, 90, 100, 110, 1, 2, 3, 4, hello java, false]

        System.out.println(r1.getFirst()); // true
        System.out.println(r1.getLast()); // false

        ResizableArray r4 = new ResizableArray();
        r4.add('a');
        r4.add('b');
        r4.add('c');
        r4.add('d');
        r2.addAll(0, r4);
        System.out.println(r2); // [a, b, c, d, 1, 2, 3, 4]
        r2.addAll(r2.getSize(), r4);
        System.out.println(r2); // [a, b, c, d, 1, 2, 3, 4, a, b, c, d]
        r2.addAll(4, r4);
        System.out.println(r2); // [a, b, c, d, a, b, c, d, 1, 2, 3, 4, a, b, c, d]

        System.out.println(r2.removeFirst()); // a
        System.out.println(r2.removeLast()); // d

        System.out.println(r2); // [b, c, d, a, b, c, d, 1, 2, 3, 4, a, b, c]
        r2.removeAll(r4);
        System.out.println(r2); // [b, c, d, 1, 2, 3, 4, a, b, c]

        r2.retainAll(r4);
        System.out.println(r2); // [b, c, d, a, b, c]

        r2.set(0, 90);
        System.out.println(r2); // [90, c, d, a, b, c]

        ResizableArray r5 = r2.sublist(0, 4);
        System.out.println(r5); // [90, c, d, a, b]

        System.out.println(r2); // [90, c, d, a, b, c]
        r2.reversed();
        System.out.println(r2); // [c, b, a, d, c, 90]

        System.out.println(r2.equals(r4)); // false
        System.out.println(r2.hashCode()); // -1652971558
    }
}


