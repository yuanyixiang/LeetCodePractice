package dfsorbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/18 8:49 下午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/minimum-genetic-mutation/submissions/
    public int minMutation(String start, String end, String[] bank) {
        char[][] banks = new char[bank.length][8];
        for(int i=0;i<bank.length;i++){
            banks[i] = bank[i].toCharArray();
        }
        solution(start.toCharArray(),end.toCharArray(),banks,0);
        return minChange == Integer.MAX_VALUE ? -1 : minChange;
    }
    int minChange = Integer.MAX_VALUE;
    public void solution(char[] start,char[] end,char[][] banks,int change){
        if(Arrays.equals(start,end)){
            minChange = Math.min(minChange,change);
            return;
        }
        for(int i=0;i < banks.length;i++){
            char[] middle = banks[i];
            if(middle == null){
                continue;
            }
            int diff = 0;
            for(int j=0;j<8;j++){
                if(start[j] != middle[j]) {
                    diff++;
                }
            }
            if(diff == 1) {
                banks[i] = null;
                solution(middle, end, banks, change + 1);
                banks[i] = middle;
            }
        }
    }

    public static void main(String[] args) {
        char[] a = new char[2];
        char[] b = new char[2];
        a[0] = '2';
        b[0] = '1';
        Queue<String> queue = new LinkedList<>();
        queue.offer("123");
        String s = queue.poll();
        System.out.println(s);
    }
}
