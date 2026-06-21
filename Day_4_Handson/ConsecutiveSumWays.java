package Day_4_Handson;

import java.util.Scanner;

public class ConsecutiveSumWays {

    public static int countWays(int n) {

        int count = 0;

        for (int start = 1; start < n; start++) {

            int sum = 0;

            for (int end = start; end < n; end++) {

                sum += end;

                if (sum == n) {
                    count++;
                    break;
                }

                if (sum > n)
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Ways = " + countWays(n));
    }
}
