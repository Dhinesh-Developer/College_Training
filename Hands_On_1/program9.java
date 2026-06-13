package Hands_On_1;

import java.util.ArrayList;
import java.util.List;

public class program9 {
	public static void main(String[] args) {
		
		int n = 5;
		List<Integer> res = print(n);
		System.out.println(res);
	}
	
	private static List<Integer> print(int n) {
		List<List<Integer>> res = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			int c = 1;
			List<Integer> li = new ArrayList<>();
			for(int j=1;j<=i;j++) {
				li.add(c);
				c = c * (i-j)/j;
			}
			res.add(li);
		}
		return res.get(res.size()-1);
	}
}
