package Day_2_HandsOn_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program3 {
	static Scanner in = new Scanner(System.in);
	public static Node head = null;
	public static LLUtil obj = new LLUtil();

	public static int[] getInput() {
		System.out.println("Enter the size: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Linked List element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
	public static int getSize(Node head) {
		Node temp = head;
		int size = 0;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public static Node findMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	public static void main(String[] args) {
		
		head = obj.insertNode(getInput());
		obj.traverse(head);
		
		Node res = findMiddleElement(head);
		System.out.println("Middle Element: "+res.data);
		
	}
}
