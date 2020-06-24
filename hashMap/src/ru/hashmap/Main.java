package ru.hashmap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, String> hmCars = new HashMap();
        Car c1 = new Car(5000, "Audi", "A4");
        Car c2 = new Car(7000, "Audi", "A6");
        Car c3 = new Car(9000, "Audi", "A8");
        Car c4 = new Car(4500, "Audi", "A4");
        hmCars.put(c1, "Max");
        hmCars.put(c2, "Kate");
        hmCars.put(c3, "Egor");
        hmCars.put(c4, "Alexey");
        Car find = new Car(10000, "Audi", "A4");
        System.out.println(hmCars.get(find));

        String[] carMark = {"Audi, BMW, "};
    }
}

class Car {
    int price;
    String mark;
    String model;

    public Car(int price, String mark, String model) {
        this.price = price;
        this.mark = mark;
        this.model = model;
    }

    public int hashCode() {
        return (this.mark.length() + this.model.length()) * 15;
    }

    public boolean equals(Object o) {
        return this.mark.equals(((Car)o).mark) && this.model.equals(((Car)o).model);
    }
}
