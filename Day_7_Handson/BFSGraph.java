package Day_7_Handson;

import java.util.*;

public class BFSGraph {

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            bfs.add(node);

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter Edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        System.out.println("Enter Edges:");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
        }

        ArrayList<Integer> result = bfsOfGraph(V, adj);

        for (int x : result)
            System.out.print(x + " ");
    }
}
