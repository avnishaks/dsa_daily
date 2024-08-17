package DSA_quick_reacap.GRAPH.Graph_1_Introduction_BFS_DFS;

import java.util.ArrayList;
import java.util.List;

public class CyclicInGraph {
    static boolean [] visited;
    static boolean [] path;
    static List<List<Integer>> adjList;
    public static void printGraph(List<List<Integer>> adjList){
        for(int i=0;i<adjList.size();i++){
            System.out.print(adjList.get(i)+" ");
        }
    }
    public static void addEdge(List<List<Integer>> adj,int s,int e){
        adj.get(s).add(e);
    }
    public static boolean isCyclic(int node){
        if(path[node]) return true;
        if(visited[node]) return false;
        path[node]=true;
        visited[node]=true;

        for (int neighbor : adjList.get(node)) {
            if (isCyclic(neighbor)) {
                return true;
            }
        }

        path[node] = false;
        return false;
    }
    public static void main(String[] args) {
        // return 1 if cycle is present else return 0
        int A=5;
        //// {1,2},{2,3},{3,4},{4,5}
        // {1,2},{4,1},{2,4},{3,4},{5,2},{1,3}
        /*
        0 ->[]
        1->2->4->1
           ^  ^
           |  |
           5  3
        4->1
        [[1,2],[1,3],[2,3],[1,4],[4,3],[4,5],[3,5]]
         */
        int [][] edges={
                {1,2},{1,3},{2,3},{1,4},{4,3},{4,5},{3,5}

        };
        visited=new boolean[A+1];
        path=new boolean[A+1];
        adjList=new ArrayList<>();
        for(int i=0;i<=A;i++){
            adjList.add(new ArrayList<>());
        }
        printGraph(adjList);
        System.out.println();
        for(int [] x:edges){
            addEdge(adjList,x[0],x[1]);
        }

        printGraph(adjList);

        System.out.println();

        System.out.println("Does Graph contain cycle or not !");

        boolean cyclicExit=false;
        for(int i=1;i<=A;i++){
            if(!visited[i]){
                if(isCyclic(i)){
                    cyclicExit=true;
                    break;
                }
            }
        }

        System.out.println("Result for the Graph contain cycle: "+cyclicExit);
    }
}
