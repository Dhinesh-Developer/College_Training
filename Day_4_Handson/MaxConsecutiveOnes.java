package Day_4_Handson;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static int longestOnes(int[] arr, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0)
                zeroCount++;

            while (zeroCount > k) {

                if (arr[left] == 0)
                    zeroCount--;

                left++;
            }

            maxLength = Math.max(maxLength,
                    right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Binary Array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Maximum Consecutive Ones = "
                + longestOnes(arr, k));
    }
}
