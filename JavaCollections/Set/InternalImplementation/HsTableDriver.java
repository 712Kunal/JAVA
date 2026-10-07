package JavaCollections.Set.InternalImplementation;

import java.util.HashSet;

public class HsTableDriver {
    public static void main(String[] args) {
        HsTable<Integer> hs = new HsTable<>();
        System.out.println(hs);

        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(9);
        hs.add(10);
        hs.add(11);
        hs.add(16);
        hs.add(17);
        hs.add(50);
        hs.add(48);


        System.out.println(hs);

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(8);
        hs1.add(9);
        hs1.add(10);
        hs1.add(11);
        hs1.add(16);
        hs1.add(17);
        hs1.add(50);
        hs1.add(48);

        System.out.println(hs1);
    }
}
