package Hands_On_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int target = in.nextInt();
		
		int[] res = twoSum(arr,n,target);
		System.out.println(Arrays.toString(res));
		
		
		in.close();
	}
	
	private static int[] twoSum(int[] arr,int n,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			int rem = target - arr[i];
			if(map.containsKey(rem)) {
				return new int[] {map.get(rem),i};
			}
			map.put(arr[i], i);
		}
		return new int[] {-1,-1};
	}
}
