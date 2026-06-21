package Day_3_Handson_2;

import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class CountTriplets {

    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    static int countTriplets(Node head, int x) {

        int count = 0;

        Node last = head;

        while (last.next != null)
            last = last.next;

        for (Node curr = head; curr != null; curr = curr.next) {

            Node left = curr.next;
            Node right = last;

            while (left != null && right != null &&
                    left != right &&
                    right.next != left) {

                int sum = curr.data + left.data + right.data;

                if (sum == x) {
                    count++;
                    left = left.next;
                    right = right.prev;
                }
                else if (sum < x)
                    left = left.next;
                else
                    right = right.prev;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++)
            head = insert(head, sc.nextInt());

        int x = sc.nextInt();

        System.out.println(countTriplets(head, x));
    }
}
