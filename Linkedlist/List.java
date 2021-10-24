package Linkedlist;

public class List {
    Node head;
    Node temp;
    Node nextNode;

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

    void delete(int pos) {
        temp = head;
        int i = 1;
        // IMPORTANT:
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        nextNode = temp.next;
        temp.next = nextNode.next;
        nextNode.next = null;
    };

    void show() {
        temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    };
}
