package dfsorbfs;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/26 11:06 上午
 */
public class Solution7 {
    //title:https://leetcode-cn.com/problems/minesweeper/submissions/
    int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};

    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return  board;
        }
        else{
            dfs(board,click[0],click[1]);
        }
        return board;
    }
    public void dfs(char[][] board,int x,int y){
        int nm = 0;
        for(int i = 0;i < 8;++i){
            int tx = x+dx[i];
            int ty = y+dy[i];
            if(tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length){
                continue;
            }
            if(board[tx][ty] == 'M'){
                ++nm;
            }
        }
        if(nm > 0){
            board[x][y] = (char)(nm+48);
        }else{
            board[x][y] = 'B';
            for(int i = 0;i < 8;++i){
                int tx = x+dx[i];
                int ty = y+dy[i];
                if(tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length || board[tx][ty] != 'E'){
                    continue;
                }
                dfs(board,tx,ty);
            }
        }
    }
}
