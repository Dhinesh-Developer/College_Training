package Day_7_Handson;

import java.util.*;

public class DFSGraph {

    static void dfs(int node,
                    boolean[] visited,
                    ArrayList<ArrayList<Integer>> adj,
                    ArrayList<Integer> result) {

        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj, result);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        ArrayList<Integer> result = new ArrayList<>();

        dfs(0, visited, adj, result);

        for (int x : result)
            System.out.print(x + " ");
    }
}
