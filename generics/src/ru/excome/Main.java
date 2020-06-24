package ru.excome;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<GenericsTest> gt = new ArrayList<GenericsTest>();
        for(int i =0; i < 5; i++) {
            gt.add(new GenericsTest<String>(String.valueOf(i)));
        }
        for(int i =5; i < 10; i++) {
            gt.add(new GenericsTest<Integer>(i));
        }
        for(int i=1; i < 7; i++) {
            gt.add(new GenericsTest<Car>(new Car("Audi", "A" + String.valueOf(i))));
        }
        for(GenericsTest temp : gt) {
            temp.display();
        }
    }
}

class GenericsTest<T> {
    T obj;
    protected void display() {
        System.out.print(obj + " ");
    }

    public GenericsTest(T obj) {
        this.obj = obj;
    }
}

class Car {
    String mark;
    String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String toString() {
        return this.mark + " " + this.model;
    }
}
