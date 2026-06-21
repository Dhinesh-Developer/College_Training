package Day_4_Handson;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

    static int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            n = squareSum(n);
        }

        System.out.println(n == 1);
    }
}
