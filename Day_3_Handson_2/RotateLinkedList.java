package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RotateLinkedList {

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

    static Node rotate(Node head, int k) {

        if (head == null || k == 0)
            return head;

        Node temp = head;
        int len = 1;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;

        if (k == 0)
            return head;

        temp.next = head;

        Node curr = head;

        for (int i = 1; i < k; i++)
            curr = curr.next;

        Node newHead = curr.next;

        curr.next = null;

        return newHead;
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

        int k = sc.nextInt();

        head = rotate(head, k);

        display(head);
    }
}
