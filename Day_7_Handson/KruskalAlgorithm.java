package Day_7_Handson;

import java.util.*;

class EdgeK {

    int src;
    int dest;
    int weight;

    EdgeK(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class KruskalAlgorithm {

    static int[] parent;

    static int find(int x) {

        if(parent[x] == x)
            return x;

        return parent[x] =
                find(parent[x]);
    }

    static void union(int a, int b) {

        int pa = find(a);
        int pb = find(b);

        parent[pa] = pb;
    }

    public static void main(String[] args) {

        int V = 4;

        EdgeK[] edges = {

                new EdgeK(0,1,7),
                new EdgeK(0,2,6),
                new EdgeK(0,3,5),
                new EdgeK(1,3,15),
                new EdgeK(2,3,2)
        };

        Arrays.sort(edges,
                (a,b)->a.weight-b.weight);

        parent = new int[V];

        for(int i=0;i<V;i++)
            parent[i] = i;

        int cost = 0;

        System.out.println("Edges in MST:");

        for(EdgeK edge : edges) {

            if(find(edge.src)
                    != find(edge.dest)) {

                union(edge.src,
                        edge.dest);

                cost += edge.weight;

                System.out.println(
                        edge.src + " - "
                                + edge.dest
                                + ", weight = "
                                + edge.weight);
            }
        }

        System.out.println(
                "Total Cost of MST: "
                        + cost);
    }
}