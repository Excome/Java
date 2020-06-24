package abstracts;

class Dog extends Animal{
    Dog() {
        super();
        System.out.println("In constructor Dog");
    }
    void says() {
        System.out.println("Woof");
    }
}
