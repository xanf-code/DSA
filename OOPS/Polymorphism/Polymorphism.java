package OOPS.Polymorphism;

class Bird {
    void sing() {
        System.out.println("Bird goes tweetweet!");
    }
}

class Crow extends Bird {
    void sing() {
        System.out.println("Crow goes skrr pop pop");
    }
}

class Owl extends Bird {
    void sing() {
        System.out.println("Own goes hung hung hung hung hung hung hung hung");
    }
}

// If parameterized then the default class is being called.
class Pigeon extends Bird {
    void sing(String sound) {
        System.out.println("Pigeon goes lalalalala");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // Polymorphism - Many Form

        Pigeon b = new Pigeon();

        b.sing();
    }
}
