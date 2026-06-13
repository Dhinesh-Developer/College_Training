package Hands_On_1;

// check the number is square root of a given number.

public class program2 {
	public static void main(String[] args) {
		
		// check perfect square
		long n = 25;
		boolean res = isValid(n);
		System.out.println(res);
	}
	
	private static boolean isValid(long n) {
		for(int i=1;i*i<=n;i++) {
			if(i*i == n) {
				return true;
			}
		}
		return false;
	}
	
//	private static boolean isValidPerfect(int n) {
//		if(n < 0) return false;
//		if(n <=1) return true;
//		
//		int low = 1,high = n;
//		while(low <= high) {
//			int mid = low+(high-low)/2;
//			
//			if(mid == n/mid && n %mid == 0) {
//				return true;
//			}else if(mid > n/mid) {
//				high = mid-1;
//			}else {
//				low = mid+1;
//			}
//		}
//		
//		return false;
//	}
}
