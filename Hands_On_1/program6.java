package Hands_On_1;

public class program6 {
	public static void main(String[] args) {
		
		int n = 6;
		print(n);
		
	}
	
	private static void print(int n) {
		int freq = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				freq += 2;
				for(int j=1;j<=freq;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=1;j<=freq;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
/*
 
**
**
****
****
******
******

 */