package Day3_HandsOn_1;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		
		String res = replace(s,s1,s2);
		System.out.println(res);
		
	}
	
	private static String replace(String s,String s1,String s2) {
		s = s.replace(s1, s2);
		return s;
	}
}
