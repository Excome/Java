package ru.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car extends Machine implements Serializable {
    int price;
    String model;
    transient Engine engine;
    Car(int price, String model, Engine engine, int weight) {
        super(weight);
        this.price = price;
        this.model = model;
        this.engine = engine;
    }
    private void writeObject(ObjectOutputStream oos) {
        try{
            oos.defaultWriteObject();
            oos.writeInt(engine.power);
            oos.writeObject(engine.producer);
        } catch (Exception ex) {}
    }
    private void readObject(ObjectInputStream ois) {
        try{
            ois.defaultReadObject();
            this.engine = new Engine(ois.readInt(), (String)ois.readObject());
        }
        catch (Exception ex) {}
    }
}

class Engine {
    int power;
    String producer;
    Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }
}

class Machine {
    int weight;
    Machine(){}
    Machine(int weight) {
        this.weight = weight;
    }
}