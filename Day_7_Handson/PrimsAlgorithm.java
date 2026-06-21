package Day_7_Handson;

import java.util.*;

class Edge {

    int vertex;
    int weight;

    Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class PrimsAlgorithm {

    public static void main(String[] args) {

        int V = 4;

        int[][] graph = {
                {0,1,0,4},
                {1,0,2,0},
                {0,2,0,3},
                {4,0,3,0}
        };

        boolean[] visited = new boolean[V];

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                        (a,b)->a[2]-b[2]);

        pq.offer(new int[]{-1,0,0});

        while(!pq.isEmpty()) {

            int[] current = pq.poll();

            int parent = current[0];
            int node = current[1];
            int weight = current[2];

            if(visited[node])
                continue;

            visited[node] = true;

            if(parent != -1) {
                System.out.println(
                        "Edge "
                                + parent + "-"
                                + node
                                + " with weight "
                                + weight);
            }

            for(int i=0;i<V;i++) {

                if(graph[node][i] != 0
                        && !visited[i]) {

                    pq.offer(
                            new int[]{
                                    node,
                                    i,
                                    graph[node][i]
                            });
                }
            }
        }
    }
}
