package Hands_On_3;

import java.util.*;

public class program5 {

	public static int findShortestSubArray(int[] nums) {

		HashMap<Integer, Integer> count = new HashMap<>();
		HashMap<Integer, Integer> first = new HashMap<>();
		HashMap<Integer, Integer> last = new HashMap<>();

		int degree = 0;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (!first.containsKey(num))
				first.put(num, i);
			last.put(num, i);
			count.put(num, count.getOrDefault(num, 0) + 1);
			degree = Math.max(degree, count.get(num));
		}
		int ans = nums.length;
		for (int key : count.keySet()) {
			if (count.get(key) == degree) {
				ans = Math.min(ans, last.get(key) - first.get(key) + 1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1 };
		System.out.println(findShortestSubArray(nums));
	}
}