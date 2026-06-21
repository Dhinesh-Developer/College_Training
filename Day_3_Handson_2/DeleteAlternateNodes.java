package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteAlternateNodes {

    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

        return head;
    }

    static Node deleteAlternate(Node head) {

        Node curr = head;

        while (curr != null && curr.next != null) {

            curr.next = curr.next.next;

            curr = curr.next;
        }

        return head;
    }

    static void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++)
            head = insert(head, sc.nextInt());

        head = deleteAlternate(head);

        display(head);
    }
}