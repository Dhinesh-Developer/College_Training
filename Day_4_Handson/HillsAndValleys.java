package Day_4_Handson;

import java.util.Scanner;

public class HillsAndValleys {

    public static int countHillValley(int[] nums) {

        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {

            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && nums[left] == nums[i])
                left--;

            while (right < nums.length && nums[right] == nums[i])
                right++;

            if (left >= 0 && right < nums.length) {

                if (nums[i] > nums[left] && nums[i] > nums[right])
                    count++;

                else if (nums[i] < nums[left] && nums[i] < nums[right])
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Count = " + countHillValley(arr));
    }
}
