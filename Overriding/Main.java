package Overriding;

class A {

    void show() {
        System.out.println("In A");
    }
}

class B extends A {

    void show() {
        // using super - calls output of class A show method.
        super.show();
        System.out.println("In B");
    }
}

public class Main {

    // Def - If subclass (child class) has the same method as declared in the parent
    // class, it is known as method overriding in Java.

    // Child class method will override parent class method.

    public static void main(String[] args) {
        B classB = new B();
        classB.show();
    }
}
