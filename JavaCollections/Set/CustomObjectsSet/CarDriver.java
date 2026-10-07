package JavaCollections.Set.CustomObjectsSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CarDriver {
    public static void main(String[] args) {
        HashSet<Car> hs = new HashSet<>();

        Car c1 = new Car("BMW", 8500000, "M5", "Black");
        Car c2 = new Car("Audi", 6500000, "A6", "White");
        Car c3 = new Car("Mercedes", 7500000, "C-Class", "Silver");
        Car c4 = new Car("Toyota", 3500000, "Fortuner", "Black");
        Car c5 = new Car("Honda", 1800000, "City", "Red");
        Car c6 = new Car("Honda", 1800000, "City", "Red");
        Car c7 = new Car("Honda", 1800000, "City", "Yellow");

        hs.add(c1);
        hs.add(c2);
        hs.add(c3);
        hs.add(c4);
        hs.add(c5);

        hs.add(c6);
        hs.add(c7);

        hs.forEach(car -> {
            System.out.println(car);
        });

        LinkedHashSet<Car> lhs = new LinkedHashSet<>();
        lhs.add(c1);
        lhs.add(c2);
        lhs.add(c3);
        lhs.add(c4);
        lhs.add(c5);
        lhs.add(c6);
        lhs.add(c7);

        System.out.println(lhs);

        TreeSet<Car> ts = new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        ts.add(c4);
        ts.add(c5);
        ts.add(c6);
        ts.add(c7);

        System.out.println(ts);

    }
}
