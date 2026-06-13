package Day_2_HandsOn_1;

import java.util.LinkedList;
import java.util.Queue;

class Implementation{
	
	Queue<Integer> q = null;
	Implementation(){
		q = new LinkedList<>();
	}
	
	public void add(int val) {
		q.offer(val);
		int size = q.size();
		for(int i=0;i<size-1;i++) {
			q.add(q.remove());
		}
	}
	
	public int pop() {
		if(q.isEmpty()) return -1;
		return q.poll();
	}
	
	public int top() {
		if(q.isEmpty()) return -1;
		return q.peek();
 	}
	
	public boolean isEmpty() {
		return q.isEmpty();
	}
}

public class program6 {
	public static void main(String[] args) {
		
		Implementation impl = new Implementation();
		
		impl.add(10);
		impl.add(20);
		impl.add(30);
		System.out.println(impl.pop());
		System.out.println(impl.top());
		impl.add(40);
		System.out.println(impl.isEmpty());
		
		
		
	}
}	
