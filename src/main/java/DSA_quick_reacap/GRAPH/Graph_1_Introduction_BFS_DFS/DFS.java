package DSA_quick_reacap.GRAPH.Graph_1_Introduction_BFS_DFS;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void addEdge(List<List<Integer>> adj,int s,int e){
        adj.get(s).add(e);
        adj.get(e).add(s);
    }
    public static void printGraph(List<List<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.println(adjList.get(i));
        }
    }
    public static void dfsSolution(List<List<Integer>> adj,boolean[] visited,int source){
        visited[source]=true;
        System.out.print(source+" ");
        for(int x:adj.get(source)){
            if(!visited[x]){
                dfsSolution(adj,visited,x);
            }
        }
    }
    public static void DFS(List<List<Integer>> adj,int source,int vertex){
        boolean [] visited=new boolean[vertex];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfsSolution(adj,visited,i);
            }
        }
    }
    public static void main(String[] args) {

        int vertex=6;
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<vertex;i++){
            adjList.add(new ArrayList<>());
        }
        System.out.println("Total number of list created !");

        printGraph(adjList);

        int[][] edges
                = { { 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };


        System.out.println("! Connecting the nodes of the graph !");



        for(int [] x:edges){
            addEdge(adjList,x[0],x[1]);
        }

        int source=1;
        System.out.println("DFS from the source node : "+source);

        /*
        There is two case :-
        =====================================================
        1. Connected Graph : For connected graph we need to call helper function only one time
        2. Disconnected Graph : For disconnected graph we need to call helper function for each node
        =====================================================
         */


        DFS(adjList,source,vertex);

        System.out.println();

        printGraph(adjList);



    }
}
