package Day3_HandsOn_1;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = in.nextInt();
		}
		
		int cnt = countPairs(nums);
		System.out.println(cnt);
		
	}
	
	private static int countPairs(int[] nums) {
		int n = nums.length;
		
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum += nums[j];
			}
			if(sum > 0) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
}
