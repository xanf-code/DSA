package Linkedlist;

public class Main {
    public static void main(String[] args) {
        List linky = new List();

        linky.insert(5);
        linky.insert(7);
        linky.insert(8);
        linky.insert(9);

        linky.show();

        linky.delete(2);

        linky.show();
    }
}
