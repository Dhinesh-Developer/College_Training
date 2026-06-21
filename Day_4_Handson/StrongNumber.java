package Day_4_Handson;

import java.util.Scanner;

public class StrongNumber {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum += factorial(digit);

            temp /= 10;
        }

        if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
