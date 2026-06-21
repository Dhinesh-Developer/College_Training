package Day_4_Handson;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        System.out.println("Array After Moving Zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
