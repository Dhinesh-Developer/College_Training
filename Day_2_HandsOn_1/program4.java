package Day_2_HandsOn_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program4 {
	
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
	
	public static Node removeDuplicates(Node head) {
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data == temp.data) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		head = obj.insertNode(getInput());
		obj.traverse(head);
		
		head = removeDuplicates(head);
		obj.traverse(head);
		
	}
}
