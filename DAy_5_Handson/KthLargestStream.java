package DAy_5_Handson;

import java.util.*;

public class KthLargestStream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        PriorityQueue<Integer> pq =
                new PriorityQueue<>();

        for(int i = 0; i < n; i++) {

            int val = sc.nextInt();

            pq.offer(val);

            if(pq.size() > k)
                pq.poll();

            if(pq.size() == k)
                System.out.print(pq.peek() + " ");
            else
                System.out.print("-1 ");
        }
    }
}
