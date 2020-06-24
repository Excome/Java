package sorting;

import java.util.Comparator;

public class Car implements Comparable{
    int speed;
    int price;
    String model;
    String color;
    Car(String model, String color, int price, int speed) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }
    public String toString() {
        return  this.model + " " + this.color + " " + this.speed + " " + this.price;
    }
    public int compareTo(Object o) {
        int temp = this.model.compareTo(((Car)o).model);
        if(temp == 0) {
            temp = this.speed - ((Car)o).speed;
            if(temp == 0) {
                temp = this.price - ((Car)o).price;
                if(temp == 0){
                    temp = this.color.compareTo(((Car)o).color);
                }
            }
        }
        return temp;
    }
    static class ComtaratorByPrice implements Comparator{
        public int compare(Object o1, Object o2) {
            return ((Car)o1).price - ((Car)o2).price;
        }
    }
    static class ComtaratorBySpeed implements Comparator{
        public int compare(Object o1, Object o2) {
            return ((Car)o1).speed - ((Car)o2).speed;
        }
    }
    static class ComtaratorByColor implements Comparator{
        public int compare(Object o1, Object o2) {
            return ((Car)o1).color.compareTo(((Car)o2).color);
        }
    }
}
