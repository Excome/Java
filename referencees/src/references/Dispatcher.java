package references;
public class Dispatcher {
    public static void main(String args[]) {
        int x = 10;
 //       System.out.println(x);
 //       changeAndDisplay(x);
        Car c = new Car();
        c.price = 4500;
        c.enginePrice = 2500;
        changeObject(c);
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c.price);
        System.out.println(c.enginePrice);
//        c.price = changeAndDisplay(c.price);
//        System.out.println(c.price);
        System.out.println(c1 == c2);
    }
    static int changeAndDisplay(int x) {
        x = x*2;
        System.out.println(x);
        return x;
    }
    static void changeObject(Car cg) {
        cg.price = cg.price * 2;
        cg.enginePrice = cg.enginePrice * 2;
    }
}
