package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/23 10:02 下午
 */
public class Solution3 {
    //https://leetcode-cn.com/problems/climbing-stairs/submissions/
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < n+1; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
