package Graphs;

import java.util.ArrayList;
import java.util.Queue;

import linkedlist.LinkedList;

public class Create {
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

    static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
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

    }

    public static void bfs(ArrayList<Edge>graph[]){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.println(curr+" ");
                vis[curr]= true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V=4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        
        // print 2's neighbour
        for(int i=0;i<graph[1].size();i++){
            Edge e=graph[1].get(i);
            System.out.println(e.dest+" ");
        }
    }
}
