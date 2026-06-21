package Day_4_Handson;

import java.util.Scanner;

public class HollowLeftTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
