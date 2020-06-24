package multyInheritance;

public class Mobile extends Computer {
    void process() {
        super.process();
        System.out.println("Mobile");
    }
    Phone makePhone() {
        return new Phone(){
            void process() {
                super.process();
                System.out.println("Mobile");
            }
        };
    }
}
