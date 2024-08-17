package DSA_quick_reacap.GRAPH.Graph_1_Introduction_BFS_DFS;

import java.util.ArrayList;
import java.util.List;

public class PathInDirectedGraph {
    static boolean [] visited;
    static List<List<Integer>> adjList;
    public static void printGraph(List<List<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.print(adjList.get(i)+" ");
        }
    }
    public static void addEdge(List<List<Integer>> adj,int s,int e){
        adj.get(s).add(e);
    }
    public static void depthFirstSearch(int source){
            for(int x:adjList.get(source)){
                if(!visited[x]){
                    visited[x]=true;
                    depthFirstSearch(x);
                }
            }
    }
    public static void main(String[] args) {
        int A=5;
        int [][] edges={
                {1,2},{2,3},{3,4},{4,5}
              //  {1,2},{4,1},{2,4},{3,4},{5,2},{1,3}
        };
        visited=new boolean[A+1];
        adjList=new ArrayList<>();
        for(int i=0;i<=A;i++){
            adjList.add(new ArrayList<>());
        }
        for(int [] x:edges){
            addEdge(adjList,x[0],x[1]);
        }
       // printGraph(adjList);
        int source=1;
        depthFirstSearch(source);
        if(visited[A]){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }


    }
}
