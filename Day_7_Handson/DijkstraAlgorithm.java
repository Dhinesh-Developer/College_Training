package Day_7_Handson;

import java.util.*;

class Pair {

    int node;
    int distance;

    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

public class DijkstraAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();
        int source = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(
                        (a, b) -> a.distance - b.distance);

        dist[source] = 0;

        pq.offer(new Pair(source, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int node = current.node;

            for (Pair neighbor : adj.get(node)) {

                if (dist[node] + neighbor.distance
                        < dist[neighbor.node]) {

                    dist[neighbor.node] =
                            dist[node] + neighbor.distance;

                    pq.offer(
                            new Pair(
                                    neighbor.node,
                                    dist[neighbor.node]));
                }
            }
        }

        for (int d : dist)
            System.out.print(d + " ");
    }
}
