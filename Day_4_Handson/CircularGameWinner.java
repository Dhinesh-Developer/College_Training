package Day_4_Handson;

import java.util.*;

public class CircularGameWinner {

    public static int findWinner(int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {

            index = (index + k - 1) % list.size();

            list.remove(index);
        }

        return list.get(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Winner = " + findWinner(n, k));
    }
}
