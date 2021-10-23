package Constructor;

public class Shirt {

    String color;
    char size;

    Shirt(String color, char size) {
        this.color = color;
        this.size = size;
    }

    // Below is default
    // void setColor(String newColor) {
    // color = newColor;
    // }

    // void setSize(char newSize) {
    // size = newSize;
    // }

    void putOn() {
        System.out.println("Shirt On!");
    }

    void takeOff() {
        System.out.println("Shirt Off!");
    }
}
