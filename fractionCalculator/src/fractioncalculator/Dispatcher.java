package fractioncalculator;
public class Dispatcher {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,7);
        Fraction f2 = new Fraction(3,8);
        View.display(Calculator.add(f1, f2));
        View.display(Calculator.minus(f2, f1));
        
    }
    
}
