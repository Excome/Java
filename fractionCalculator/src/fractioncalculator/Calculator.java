package fractioncalculator;
public class Calculator {
    static Fraction add(Fraction f1, Fraction f2) {
        Fraction summa = new Fraction();
        summa.numinator = f1.numinator * f2.denuminator + f2.numinator * f1.denuminator;
        summa.denuminator = f1.denuminator * f2.denuminator;
        return summa;
    }
    static Fraction minus(Fraction f1, Fraction f2) {
        Fraction summa = new Fraction();
        summa.numinator = f1.numinator * f2.denuminator - f2.numinator * f1.denuminator;
        summa.denuminator = f1.denuminator * f2.denuminator;
        return summa;
    }
}
