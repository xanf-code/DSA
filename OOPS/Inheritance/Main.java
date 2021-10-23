package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Mouse2 m2 = new Mouse2();

        // Properties in generic mouse
        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();

        // Properties specific to mouse-2
        m2.connect();
    }
}
