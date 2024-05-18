package DSA_Leetcode_POD;

import java.util.*;

public class May14 {

    private int [][] grid;
    private boolean [][] visited;
    private int row;
    private int column;

    public May14(int [][] grid){
        this.grid=grid;
        this.row= grid.length;
        this.column=grid[0].length;
        this.visited=new boolean[row][column];

    }

    public int collectGoldValue(int i,int j){
        int collectGold=0;
        if(i<0||i>=row || j<0 || j>=column || grid[i][j]==0 || visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        collectGold=grid[i][j]+Math.max(Math.max(collectGoldValue(i+1,j),collectGoldValue(i-1,j)),
                Math.max(collectGoldValue(i,j+1),collectGoldValue(i,j-1)));

        visited[i][j]=false;

        return collectGold;
    }

    public int findMaxGold(int[][] grid){
        int maxGold=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    maxGold=Math.max(maxGold,collectGoldValue(i,j));
                }
            }
        }
        return maxGold;
    }
    public static void main(String[] args) {
        int[][] grid = { {1,0,7}, {2,0,6}, {3,4,5} , {0,3,0} , {9,0,20} };

        May14 answerObj=new May14(grid);

        System.out.println("The value for the maximum gold is : " + answerObj.findMaxGold(grid));

    }
}
