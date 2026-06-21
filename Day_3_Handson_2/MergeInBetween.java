package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeInBetween {

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

    static Node merge(Node list1, int a, int b, Node list2) {

        Node prevA = list1;

        for (int i = 0; i < a - 1; i++)
            prevA = prevA.next;

        Node afterB = prevA;

        for (int i = a - 1; i <= b; i++)
            afterB = afterB.next;

        prevA.next = list2;

        Node temp = list2;
        while (temp.next != null)
            temp = temp.next;

        temp.next = afterB;

        return list1;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Node list1 = null;

        for (int i = 0; i < n1; i++)
            list1 = insert(list1, sc.nextInt());

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n2 = sc.nextInt();
        Node list2 = null;

        for (int i = 0; i < n2; i++)
            list2 = insert(list2, sc.nextInt());

        Node result = merge(list1, a, b, list2);

        display(result);
    }
}