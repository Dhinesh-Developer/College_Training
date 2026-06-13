package Hands_On_2;

import java.util.Arrays;
import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int[] res = productOfArrayExceptItself1(arr,n);
		System.out.println(Arrays.toString(res));
		
	}

//	private static int[] productOfArrayExceptItself2(int[] arr, int n) {
//		int[] res = new int[n];
//		int ind = 0;
//		
//		for(int i=0;i<n;i++) {
//			int prod  = 1;
//			for(int j=0;j<n;j++) {
//				if(arr[i] != arr[j]) {
//					prod *= arr[j];
//				}
//			}
//			res[ind++] = prod;
//		}
//		
//		return res;
//	}
	
	private static int[] productOfArrayExceptItself1(int[] arr, int n) {
		int[] res = new int[n];
		int ind = 0;
		
		res[0] = 1;
		for(int i=1;i<n;i++) {
			res[i] = res[i-1] * arr[i-1];
		}
		
		int suffix = 1;
		for(int i=n-1;i>=0;i--) {
			res[i] *= suffix;
			suffix *= arr[i];
		}
		
		return res;
	}
	
}
