package Constructor;

public class Main {
    public static void main(String[] args) {

        // Creating a new object
        // Shirt is the default constructor
        // Constructor - Methods that makes objects

        // Def - A constructor in Java is a special method that is used to initialize
        // objects.

        /*
         * Shirt s = new Shirt();
         * 
         * s.setColor("White"); s.setSize('M');
         * 
         * System.out.println(s.color); System.out.println(s.size);
         */

        Shirt s = new Shirt("white", 'M');

        System.out.println(s.color);
        System.out.println(s.size);
    }
}
