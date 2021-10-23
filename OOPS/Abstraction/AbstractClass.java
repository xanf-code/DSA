package OOPS.Abstraction;

abstract class Dog {
    public void bark() {
        System.out.println("Bow Bow");
    }

    // It needs to poop but doesn't know since it's not implemented yet.

    // Why abstract? - Making it 100% sure every dog must poop but they do it
    // differently.
    abstract public void poop();
}

class Nanook extends Dog {
    public void poop() {
        System.out.println("Dog pooped");
    }
}

class Johny extends Dog {
    public void poop() {
        System.out.println("Johny pooped a little differently");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Def - Data abstraction is the process of hiding certain details and showing
        // only essential information to the user.

        /* Nanook d = new Nanook(); */
        Johny j = new Johny();

        j.bark();

        j.poop();
    }
}
