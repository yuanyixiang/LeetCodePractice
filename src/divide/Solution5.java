package divide;

import java.util.*;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/16 9:38 下午
 */
public class Solution5 {
    //title:https://leetcode-cn.com/problems/n-queens/submissions/
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<List<String>>();
        int[] queens = new int[n];

        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        backtrack(solutions, queens, n, 0, columns, diagonals1, diagonals2);
        return solutions;
    }
    public void backtrack(List<List<String>> solutions,int[] queens,int n
            ,int row,Set<Integer> columns,Set<Integer> diagonals1,Set<Integer> diagonals2){
        if(row == n){
            List<String> strings =  format(queens,n);
            solutions.add(strings);
        }
        for(int i = 0 ;i < n;i++){
            if(columns.contains(i)){
                continue;
            }
            int diag1 = row - i;
            if(diagonals1.contains(diag1)){
                continue;
            }
            int diag2 = row + i;
            if(diagonals2.contains(diag2)){
                continue;
            }
            queens[row] = i;
            columns.add(i);
            diagonals1.add(diag1);
            diagonals2.add(diag2);
            backtrack(solutions, queens, n, row + 1, columns, diagonals1, diagonals2);
            queens[row] = -1;
            columns.remove(i);
            diagonals1.remove(diag1);
            diagonals2.remove(diag2);
        }
    }
    public List<String> format(int[] queens,int n){
        List<String> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            char[] queen = new char[n];
            Arrays.fill(queen,'.');
            queen[queens[i]] = 'Q';
            list.add(new String(queen));
        }
        return list;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(1);
        queue.peek();
        int i = queue.remove();
        System.out.println(queue.isEmpty()+""+i);
    }
}
