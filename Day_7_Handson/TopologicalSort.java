package Day_7_Handson;

import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[V];

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {

            if (indegree[i] == 0)
                queue.offer(i);
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!queue.isEmpty()) {

            int node = queue.poll();

            topo.add(node);

            for (int neighbor : adj.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0)
                    queue.offer(neighbor);
            }
        }

        for (int x : topo)
            System.out.print(x + " ");
    }
}
