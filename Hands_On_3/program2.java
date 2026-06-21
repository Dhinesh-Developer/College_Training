package Hands_On_3;

public class program2 {
	public static void main(String[] args) {
		
		int n = 5;

        for (int i= 0;i <n;i++) {
            char start = (char) ('A' +n -i- 1);
            for (char ch = start;ch<=('A'+ n -1);ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
	}
}
