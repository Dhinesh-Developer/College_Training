package Hands_On_1;

public class program7 {
	public static void main(String[] args) {
		
		
		int n = 5;
		
		print(n);
	}
	
	private static void print(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
