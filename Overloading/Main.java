package Overloading;

public class Main {

    // Overloaded methods can have different return types.
    // Must have different parameters.
    // Def - With method overloading, multiple methods can have the same name with
    // different parameters:

    public static void sayHi() {
        System.out.println("Say Hi!");
    }

    public static String sayHi(String name) {
        return "Hi " + name;
    }

    public static void main(String[] args) {
        sayHi();
        System.out.println(sayHi("Darshan"));
    }
}
