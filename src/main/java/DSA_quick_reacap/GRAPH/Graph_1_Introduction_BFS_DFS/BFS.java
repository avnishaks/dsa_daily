package DSA_quick_reacap.GRAPH.Graph_1_Introduction_BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void BFS(List<List<Integer>> adj,int source,boolean[] visited){
        Queue<Integer> queue=new LinkedList<>();
        visited[source]=true;
        queue.offer(source);
        while(!queue.isEmpty()){
            int curr=queue.poll();
            System.out.print(curr+" ");
            for(int x:adj.get(curr)){
                if(!visited[x]){
                    visited[x]=true;
                    queue.offer(x);
                }
            }
        }

    }

    public static void addEdge(List<List<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {

        int vertex=9;
        List<List<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<vertex;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,4);
        addEdge(adjList,4,3);
        addEdge(adjList,0,5);
        addEdge(adjList,6,7);
        addEdge(adjList,7,8);
        addEdge(adjList,8,6);

        boolean [] visited=new boolean[vertex];

        System.out.println("Nodes of the Graph in Adjacency List :");

        for(int i=0;i<adjList.size();i++){
            System.out.println(adjList.get(i));
        }

        System.out.println("After performing Breadth First Search from the source point 0 : ");

        // If the graph is connected
        //BFS(adjList,0,visited);

        //If the graph is disconnected
        for(int i=0;i<adjList.size();i++){
            if(!visited[i]){
                BFS(adjList,i,visited);
            }
        }





    }
}
