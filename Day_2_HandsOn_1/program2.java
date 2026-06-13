package Day_2_HandsOn_1;

import java.util.Scanner;

public class program2 {

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

	public static Node removeElement(Node head, int val) {
		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {

		head = obj.insertNode(getInput());
		obj.traverse(head);

		System.out.println("Enter the Element to be remove: ");
		int val = in.nextInt();
		head = removeElement(head, val);
		obj.traverse(head);

	}

}
