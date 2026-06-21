package Day_4_Handson;

import java.util.Scanner;

public class ReverseBits {

    public static long reverseBits(long n) {

        long result = 0;

        for (int i = 0; i < 32; i++) {

            result <<= 1;

            result |= (n & 1);

            n >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long n = sc.nextLong();

        System.out.println(reverseBits(n));
    }
}
