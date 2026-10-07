package JavaCollections.Set.CustomObjectsSet;

import java.util.Objects;

public class Car implements Comparable<Car> {
    String brand;
    double price;
    String model;
    String color;

    public Car() {

    }

    public Car(String brand, double price, String model, String color) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof Car) {
                Car car = (Car) o;
                return Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, model, color);
    }

    public int compareTo(Car c) {
        return price > c.price ? 1 : (price == c.price ? 0 : -1);
    }
}
