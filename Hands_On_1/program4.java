package Hands_On_1;

import java.util.HashMap;
import java.util.Map;

public class program4 {
	public static void main(String[] args) {
		
		int n = 101;
		
		int res = find(n);
		System.out.println(res);
		
	}
	
	private static int find(int n) {
		Map<Integer,Integer> map = new HashMap<>();
		while(n > 0) {
			int last = n%10;
			map.put(last, map.getOrDefault(last, 0)+1);
			n /= 10;
		}
		
		int total = 0;
		for(Map.Entry<Integer, Integer> x : map.entrySet()) {
			total += x.getKey() * x.getValue();
		}
		
		return total;
			
	}
}
