package Hands_On_1;

public class program3 {
	public static void main(String[] args) {
		
		int n = 8;
		int res = find(n);
		System.out.println(res);
	}
	
	private static int find(int n) {
		int low = 1, high = n;
		while(low <= high) {
			int mid = low+(high-low)/2;
			int left = iterate(1,mid);
			int right = iterate(mid,n);
			if(left == right) {
				return mid;
			}else if(left > right) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	private static int iterate(int mid,int n) {
		int sum = 0;
		for(int i=mid;i<=n;i++) {
			sum += i;
		}
		return sum;
	}
}
