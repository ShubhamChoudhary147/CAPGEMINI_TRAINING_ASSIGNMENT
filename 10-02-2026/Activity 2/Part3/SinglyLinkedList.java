class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if(pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByValue(int value) {
        if(head == null) return;

        if(head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if(temp.next != null)
            temp.next = temp.next.next;
    }

    public int countNodes() {
        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void findMiddle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
