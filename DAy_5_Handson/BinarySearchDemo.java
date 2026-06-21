package DAy_5_Handson;

import java.util.*;

public class BinarySearchDemo {

    public static int binarySearch(
            int[] arr,
            int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid =
                    left + (right-left)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(
                binarySearch(arr,target));
    }
}
