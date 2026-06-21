package Day_4_Handson;

import java.util.Scanner;

public class MinimumBitFlips {

    public static int minBitFlips(int start, int goal) {

        int xor = start ^ goal;

        int count = 0;

        while (xor > 0) {

            count += xor & 1;

            xor >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter Goal: ");
        int goal = sc.nextInt();

        System.out.println("Minimum Flips = " +
                minBitFlips(start, goal));
    }
}
