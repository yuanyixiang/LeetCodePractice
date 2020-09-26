package dfsorbfs;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/25 10:28 上午
 */
public class Solution6 {
    //title:https://leetcode-cn.com/problems/number-of-islands/submissions/
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int M = grid.length;
        int N = grid[0].length;
        int numIslands = 0;
        for(int i = 0 ;i  < M;i++){
            for(int j = 0;j < N;j++){
                if(grid[i][j] == '1'){
                    numIslands++;
                    dfs(grid,M,N,i,j);
                }
            }
        }
        return numIslands;
    }
    public void dfs(char[][] grid,int M,int N,int i,int j){
        if(i>=M||j>=N||i<0||j<0||grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,M,N,i+1,j);
        dfs(grid,M,N,i-1,j);
        dfs(grid,M,N,i,j+1);
        dfs(grid,M,N,i,j-1);
    }
}
