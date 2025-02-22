package Graphs;

import java.util.*;
public class Graph1{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

    }
    
    // create a graph
    static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(1,4,1));
        
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(1,5,1));
        
        graph[4].add(new Edge(4,2,2));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[5].add(new Edge(6, 5, 1));

    }
    

    // BFS Traversal
    public static void bfs(ArrayList<Edge>graph[]){
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0); //source=0

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){ //visit curr
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){  //neighbours k liye
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS Traversal
   /* public static void dfs(ArrayList<Edge>[]graph,int curr,int j, boolean vis[]){
        // visit
        System.out.println(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,i, vis);
            }
        }
    }*/

    public static void main(String[] args) {
        // int V=7;
        // ArrayList<Edge>graph[]=new ArrayList[V];

        // createGraph(graph);
        // bfs(graph);
        // dfs(graph, V, 0,new boolean[V]);
    }
}