package DAy_5_Handson;

import java.util.*;

public class TransitionPoint {

    public static int transitionPoint(
            int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int ans = -1;

        while(left <= right) {

            int mid =
                    left + (right-left)/2;

            if(arr[mid] == 1) {

                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                transitionPoint(arr));
    }
}
