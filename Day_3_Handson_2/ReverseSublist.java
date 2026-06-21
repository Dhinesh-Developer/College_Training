package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseSublist {

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

    static Node reverseBetween(Node head, int left, int right) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        for (int i = 1; i < left; i++)
            prev = prev.next;

        Node curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            Node temp = curr.next;

            curr.next = temp.next;

            temp.next = prev.next;

            prev.next = temp;
        }

        return dummy.next;
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

        int x = sc.nextInt();
        int y = sc.nextInt();

        head = reverseBetween(head, x, y);

        display(head);
    }
}
