package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {

        // Def - Encapsulation in Java is a mechanism of wrapping the data (variables)
        // and code acting on the data (methods) together as a single unit.

        Student s = new Student();

        s.setName("Rahul");
        s.setAge(23);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
