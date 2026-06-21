package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeSortedLists {

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

    static Node merge(Node list1, Node list2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null)
            tail.next = list1;

        if (list2 != null)
            tail.next = list2;

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

        int n1 = sc.nextInt();

        Node list1 = null;

        for (int i = 0; i < n1; i++)
            list1 = insert(list1, sc.nextInt());

        int n2 = sc.nextInt();

        Node list2 = null;

        for (int i = 0; i < n2; i++)
            list2 = insert(list2, sc.nextInt());

        Node result = merge(list1, list2);

        display(result);
    }
}
