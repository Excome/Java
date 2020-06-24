package polymorphism;

public class Bird {
    void move() {
        System.out.println("Different ways");
    }
    Bird createBird() {
        return new Bird();
    }
}

class Swallow extends Bird {
    void move() {
        System.out.println("Fly");
    }
    Swallow createBird() {
        return new Swallow();
    }
}

class Strauss extends Bird {
    void move() {
        System.out.println("Run");
    }
    Strauss createBird() {
        return new Strauss();
    }
}

class Penguin extends Bird {
    void move() {
        System.out.println("Swim");
    }
    Penguin createBird() {
        return new Penguin();
    }
}
