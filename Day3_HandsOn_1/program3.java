package Day3_HandsOn_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = in.nextInt();
		}
		
		int res = majorityElement(nums);
		System.out.println(res);
		
	}
	
	private static int majorityElement(int[] nums) {
		int n = nums.length;
		
		if(nums.length == 1) {
			return nums[0];
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		int k = n/2;
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		
		for(Map.Entry<Integer, Integer> x : map.entrySet()) {
			if(x.getValue() > k) {
				return x.getKey();
			}
		}
		return -1;
	}
	
}
