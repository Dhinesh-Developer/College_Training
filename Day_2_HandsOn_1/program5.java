package Day_2_HandsOn_1;

import java.util.Scanner;

public class program5 {

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

	public static int findValue(Node head) {
		Node temp = head;
		String val = "";

		while (temp != null) {
			val += temp.data;
			temp = temp.next;
		}

		return Integer.parseInt(val, 2);
	}

	public static void main(String[] args) {
		head = obj.insertNode(getInput());
		obj.traverse(head);
		
		int val = findValue(head);
		System.out.println("Decimal Value: "+val);

	}
}
