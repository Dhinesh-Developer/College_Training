package Day_2_HandsOn_1;

public class LLUtil {
	
	public Node insertNode(int[] arr) {
		Node head = new Node(arr[0]);
		Node temp = head;
		for(int i=1;i<arr.length;i++) {
			Node newNode = new Node(arr[i]);
			temp.next = newNode;
			temp = newNode;
		}
		
		return head;
	}
	
	public void traverse(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	public Node insertAtBeginning(Node head,int val) {
//		Node temp = head;
		Node newHead = new Node(val);
		newHead.next = head;
		head = newHead;
		
		return head;
	}
	
	public Node insertAtEnd(Node head,int val) {
		Node lastNode = new Node(val);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = lastNode;
		
		return head;
	}
	
	public Node insertAtKthPosition(Node head,int val,int pos) {
		
		if(head == null || pos == 1) {
			Node newNode = new Node(val);
			return newNode;
		}
		
		Node temp = head;
		Node newNode = new Node(val);
		
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}
	
	
	public Node deleteAtBeginning(Node head) {
		Node temp = head;
		return head.next;
	}
	
	public Node deleteAtEnd(Node head) {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
		return head;
	}
	
	public Node deleteAtSpecificPosition(Node head,int pos) {
		Node temp = head;
		if(pos == 1) {
			return deleteAtBeginning(head);
		}
		
		int ind = 1;
		while(temp != null) {
			if(ind == pos-1 && temp.next != null) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
			ind++;
		}
		return head;
	}
	
}
