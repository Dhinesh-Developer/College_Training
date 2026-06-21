package Day_4_Handson;

import java.util.Scanner;

public class RotateMatrix {

    static void rotate(int[][] mat, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int j = 0; j < n; j++) {

            int top = 0;
            int bottom = n - 1;

            while (top < bottom) {

                int temp = mat[top][j];
                mat[top][j] = mat[bottom][j];
                mat[bottom][j] = temp;

                top++;
                bottom--;
            }
        }
    }

    static void display(int[][] mat, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Matrix Size: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                mat[i][j] = sc.nextInt();
            }
        }

        rotate(mat, n);

        System.out.println("Rotated Matrix:");

        display(mat, n);
    }
}