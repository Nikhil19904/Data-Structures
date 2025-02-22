// package Graphs;

// import java.util.*;

// public class Graph3 {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[1].add(new Edge(1, 2, 2));
//         graph[1].add(new Edge(1, 3, 2));

//         graph[2].add(new Edge(2, 3, -1));

      

//     }
    
//     // Bellman's Ford Algorithm :
//     public static void bellmanFord(ArrayList<Edge> graph[], int src, int V) {
//         int dist[] = new int[V];
//         for (int i = 0; i < V; i++) {
//             if (i != src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         for (int K = 0; K < V-1; K++) { //O(V)
//             //O(E)
//             for (int i = 0; i < V; i++) {
//                 for (int j = 0; j < graph[i].size(); j++) {
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                     if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
//                         dist[v] = dist[u] + e.wt;
//                     }
//                 }

//             }
//         }

//         for(int i=0;i<dist.length;i++){
//             System.out.print(dist[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int V = 5;

//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bellmanFord(graph, 0, V);
//     }

// }
