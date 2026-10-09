package JavaCollections.map.InternalImplementation;

import java.util.HashMap;

public class HsMapDriver {
    public static void main(String[] args) {
        HsMap<Integer, String> mpp = new HsMap<>();

        mpp.put(1, "Kunal Ganjawala");
        mpp.put(2, "Aayush Bhola");
        mpp.put(3, "Anmol Singh");
        mpp.put(4, "Aniket Anni");
        mpp.put(5, "Nitin Gadkari");
        mpp.put(6, "Keshav Stark");
        mpp.put(7, "Shubham Gill");

        mpp.put(1, "Kunal Khemu");

        mpp.put(8, "ABC");
        mpp.put(9, "DEF");
        mpp.put(10, "GHI");
        mpp.put(11, "JKL");
        mpp.put(12, "MNO");
        mpp.put(13, "PQR");

        System.out.println(mpp);

        System.out.println();

        HashMap<Integer, String> mpp1 = new HashMap<>();
        mpp1.put(1, "Kunal Ganjawala");
        mpp1.put(2, "Aayush Bhola");
        mpp1.put(3, "Anmol Singh");
        mpp1.put(4, "Aniket Anni");
        mpp1.put(5, "Nitin Gadkari");
        mpp1.put(6, "Keshav Stark");
        mpp1.put(7, "Shubham Gill");

        mpp1.put(1, "Kunal Khemu");

        mpp1.put(8, "ABC");
        mpp1.put(9, "DEF");
        mpp1.put(10, "GHI");
        mpp1.put(11, "JKL");
        mpp1.put(12, "MNO");
        mpp1.put(13, "PQR");

        System.out.println(mpp1);
    }
}
