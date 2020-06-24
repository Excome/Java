package sorting;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	    int[] x = {3,2,7,4,9,4,1,8,5};
	    String[] s = {"Max", "Katya", "Sveta", "Bogdan", "Egor"};
        Arrays.sort(x);
        Arrays.sort(s);
        for(int temp : x) {
            System.out.print(temp + " ");
        }
        for(String temp : s) {
            System.out.print(temp + " ");
        }
        System.out.println();
        Car c1 = new Car("BMW", "Red", 8000, 240);
        Car c2 = new Car("BMW", "Grey", 8000, 240);
        Car c3 = new Car("Audi", "White", 6500, 210);
        Car[] c = {c1,c2,c3};
        Arrays.sort(c);
        System.out.println();
        for(Car temp : c) {
            System.out.println(temp + " ");
        }
        System.out.println();
        Arrays.sort(c, new Car.ComtaratorByColor());
        for(Car temp : c) {
            System.out.println(temp + " ");
        }
    }
}
