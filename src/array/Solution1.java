package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/23 9:07 下午
 */
/*
* title:https://leetcode-cn.com/problems/container-with-most-water/*/
public class Solution1 {
    public int maxArea(int[] height) {
        int i = 0 , j = height.length-1;
        int res = 0;
        while(i < j){
            res = Math.max(res,height[i] < height[j] ? (j - i) * height[i++] : (j - i) * height[j--]);
        }
        return res;


    }
}
