package Day_2_HandsOn_1;

import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char target = in.nextLine().charAt(0);
		
		String res = reversePrefix(s,target);
		System.out.println(res);
		
	}
	
	public static String reversePrefix(String s,char target) {
		
		int n = s.length();
		int ind = s.indexOf(target);
		
		
		String sub = s.substring(0,ind+1);
		
		StringBuilder res = new StringBuilder();
		res.append(sub).reverse().toString();
		res.append(s.substring(ind+1)).toString();
		
		return res.toString();
	}
	
}
