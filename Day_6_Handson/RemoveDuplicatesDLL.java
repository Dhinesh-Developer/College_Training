package Day_6_Handson;

import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveDuplicatesDLL {

    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if(head == null)
            return newNode;

        Node temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    static Node removeDuplicates(Node head) {

        Node curr = head;

        while(curr != null && curr.next != null) {

            if(curr.data == curr.next.data) {

                curr.next = curr.next.next;

                if(curr.next != null)
                    curr.next.prev = curr;
            }
            else {
                curr = curr.next;
            }
        }

        return head;
    }

    static void display(Node head) {

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for(int i=0;i<n;i++) {
            head = insert(head, sc.nextInt());
        }

        head = removeDuplicates(head);

        display(head);
    }
}