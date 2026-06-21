package Day_3_Handson_2;

import java.util.*;

public class ReverseFirstKQueue {

    static Queue<Integer> reverseK(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++)
            st.push(q.remove());

        while (!st.isEmpty())
            q.add(st.pop());

        int size = q.size();

        for (int i = 0; i < size - k; i++)
            q.add(q.remove());

        return q;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            q.add(sc.nextInt());

        q = reverseK(q, k);

        while (!q.isEmpty())
            System.out.print(q.remove() + " ");
    }
}
