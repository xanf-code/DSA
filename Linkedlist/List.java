package Linkedlist;

public class List {
    Node head;
    Node temp;

    void insert(int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = temp = newNode;
        } else {
            temp.next = newNode;
            // IMPORTANT:
            temp = newNode;
        }

    };

    void delete(int index) {
        // Delete Tomorrow
    };

    void show() {
        temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    };
}
