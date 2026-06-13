package Hands_On_1;

// Given an interger num, return the number if digits in num that divide num.
// an integer val divides num%val == 0.
public class program1 {
	public static void main(String[] args) {
		
		long n = 1248;
		int res = count(n);
		System.out.println(res);
		
	}
	
	private static int count(long n) {
		if(n <1) return 0;
		long dup = n;
		int cnt = 0;
		while(n > 0){
			long last = n%10;
			if(dup%last == 0) cnt++;
			n /= 10;
		}
		return cnt;
	}
}
