package abstracts;

class Cat extends Animal{
    Cat(){
        super();
        System.out.println("In constructor Cat ");
    }
    void says() {
        System.out.println("Mjau");
    }
}
