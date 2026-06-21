package Day_4_Handson;

import java.util.Scanner;

public class LongestConsecutiveOnes {

    public static int maxConsecutiveOnes(int n) {

        int count = 0;
        int max = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

            n = n >> 1;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(maxConsecutiveOnes(n));
    }
}