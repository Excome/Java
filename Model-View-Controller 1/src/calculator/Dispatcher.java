package calculator;
public class Dispatcher {
    public static void main(String[] args) {
        Model m = new Model(20,440);
        View.printInt(Controller.add(m));
        View.printInt(Controller.multiply(m));
        System.out.println(args[0] + " " + args[2]);
    }
}
