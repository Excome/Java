package interfaces;

abstract public class Animal implements Lifeable, OtherInterface {
    public void live() {
        System.out.println("From mother and father");
    }
    abstract void say();

}

class Dog extends Animal {
    void say() {
        System.out.println("woof");
    }

    public void othermethod(){}
}