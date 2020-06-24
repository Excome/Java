package ru.smplprojects;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Strauss[] s = {new Strauss(40), new Strauss(50)};
        Penguin[] p = {new Penguin(10), new Penguin(15), new Penguin(20)};
        Controller<Strauss> c1 = new Controller<Strauss>(s);
        Controller<Penguin> c2 = new Controller<Penguin>(p);
        Controller.weightCompare(c1, c2);

        List<Strauss> listStrauss = new ArrayList<Strauss>();
        List<Penguin> listPenguin = new ArrayList<Penguin>();
        listStrauss.add(new Strauss(40));
        listStrauss.add(new Strauss(45));
        listStrauss.add(new Strauss(50));
        listPenguin.add(new Penguin(10));
        listPenguin.add(new Penguin(12));
        listPenguin.add(new Penguin(14));
        listPenguin.add(new Penguin(16));
        rightController.weightCompare(listStrauss, listPenguin);
    }
}

class Bird {
    int weight;

    public Bird(int weight) {
        this.weight = weight;
    }
    void move(){};
}

class Strauss extends Bird {
    public Strauss(int weight) {
        super(weight);
    }

    void move(){
        System.out.println("Run");
    };
}

class Penguin extends Bird {
    public Penguin(int weight) {
        super(weight);
    }

    void move(){
        System.out.println("Swim");
    };
}

class rightController {
    static <T extends Bird> int weightDefine(List<T> list) {
        int summ = 0;
        for(T temp : list) {
            summ += temp.weight;
        }
        return summ;
    }
    static  <T extends Bird> void weightCompare(List<? extends  Bird> list1, List<? extends Bird> list2) {
        System.out.println(weightDefine(list1) - weightDefine(list2));
    }
}

class Controller<T extends Bird> {
    T[] array;

    public Controller(T[] array) {
        this.array = array;
    }

    void display() {
        for(T temp : array) {
            temp.move();
        }
    }
    int weightDefine() {
        int summ = 0;
        for(T temp : array) {
            summ += temp.weight;
        }
        return summ;
    }
    static void weightCompare(Controller<?> c1, Controller<?> c2) {
        System.out.println(c1.weightDefine() - c2.weightDefine());
    }
}

