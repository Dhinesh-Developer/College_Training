package Day_4_Handson;

import java.util.Scanner;

public class CountWaysStairs {

    public static long countWays(int n) {

        if (n <= 2)
            return n;

        long first = 1;
        long second = 2;

        for (int i = 3; i <= n; i++) {

            long third = first + second;

            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Ways = " + countWays(n));
    }
}
