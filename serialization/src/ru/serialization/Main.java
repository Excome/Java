package ru.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\02max\\Desktop\\Prog\\JAVA\\serialization\\src\\ru\\serialization\\file1.txt");
        Car c = new Car(3000, "BMW", new Engine(500, "MANN"), 100);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(c);
        oos.flush();
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Car c2 = (Car)ois.readObject();
        ois.close();
        System.out.println("Model: " + c2.model + " \nPrice: " + c2.price + " \nEngine.power: " + c2.engine.power + "\nEngine.producer: " + c2.engine.producer +
                " \nWeight: " + c2.weight);
    }
}
