package Day3_HandsOn_1;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = in.nextInt();
		}
		
		int res = maximumProductSubarray(nums);
		System.out.println(res);
		
	}
	
	private static int maximumProductSubarray(int[] nums) {
		int n = nums.length;
		
		int maxProd = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int prod = 1;
			for(int j=i;j<n;j++) {
				prod *= nums[j];
				maxProd = Math.max(maxProd, prod);
			}
			
		}
		
		return maxProd;
	}
}
