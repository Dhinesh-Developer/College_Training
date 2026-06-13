package Day_2_HandsOn_1;

import java.util.Scanner;

public class program1 {
	public static LLUtil obj = new LLUtil();

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5};
		Node head = null;
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Create the Linked List");
			System.out.println("2. Traverse");
			System.out.println("3. Insert At beginning");
			System.out.println("4. Insert At End");
			System.out.println("5. Insert At kth position");
			System.out.println("6. Delete At Beginning");
			System.out.println("7. Delete At End");
			System.out.println("8. Delete At specific position");
			System.out.println("10.Exit");
			
			System.out.println("Enter the choice: ");
			int choice = in.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size: ");
				int n = in.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter the Linked List element: ");
				for(int i=0;i<n;i++) {
					arr[i] = in.nextInt();
				}
				head = obj.insertNode(arr);
				break;
				
			case 2:
				obj.traverse(head);
				break;
				
			case 3:
				System.out.println("Enter the Element :");
				int insert1 = in.nextInt();
				head = obj.insertAtBeginning(head, insert1);
				obj.traverse(head);
				break;
			case 4:
				System.out.println("Enter the Element :");
				int insert2 = in.nextInt();
				head = obj.insertAtEnd(head, insert2);
				obj.traverse(head);
				break;
				
			case 5:
				System.out.println("Enter the Element :");
				int insert3 = in.nextInt();
				System.out.println("Enter the position to insert: ");
				int pos = in.nextInt();
				head = obj.insertAtKthPosition(head, insert3, pos);
				obj.traverse(head);
				break;
				
			case 6:
				head = obj.deleteAtBeginning(head);
				obj.traverse(head);
				break;
			
			case 7:
				head = obj.deleteAtEnd(head);
				obj.traverse(head);
				break;
				
			case 8:
				System.out.println("Enter the position: ");
				int pos2 = in.nextInt();
				head = obj.deleteAtSpecificPosition(head, pos2);
				obj.traverse(head);
				break;
				
			case 10:
				System.out.println("program terminated!!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
			
		}
				
	}

}
