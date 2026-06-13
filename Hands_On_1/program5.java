package Hands_On_1;

public class program5 {
	public static void main(String[] args) {

		int n = 240;
		int k = 2;

		int cnt = find(n, k);
		System.out.println(cnt);

	}

//	private static int find(int n, int k) {
//		int dup = n;
//		int cnt = 0;
//		String val = String.valueOf(n);
//		for (int i = 0; i < k; i++) {
//			if (i > 0 && ((val.charAt(i - 1) == '0') == (val.charAt(i) == '0'))) {
//				continue;
//			}
//			String sub = val.substring(i, k - i + 1);
//			int cur = Integer.parseInt(sub);
//			if (dup % cur == 0) {
//				cnt++;
//			}
//		}
//
//		return cnt;
//	}

//	private static int find(int n,int k) {
//		String len = String.valueOf(n);
//		int cnt = 0;
//		for(int i=1;i<=len.length()-k;i++) {
//			int sub = 0;
//			for(int j=i;j<i+k;j++) {
//				sub += j;
//			}
//			if(sub % n == 0) {
//				cnt++;
//			}
//		}
//		return cnt;
//	}

	public static int find(int n, int k) {
		String str = String.valueOf(n);
		int cnt = 0;

		for (int i =0;i <=str.length() -k;i++) {

			String sub = str.substring(i,i +k);
			int value = Integer.parseInt(sub);

			if (value != 0 && n %value == 0) {
				cnt++;
			}
		}

		return cnt;
	}
}
