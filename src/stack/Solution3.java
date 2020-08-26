package stack;

import java.util.Stack;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/26 5:49 下午
 */
public class Solution3 {
    //https://leetcode-cn.com/problems/largest-rectangle-in-histogram/submissions/
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }
        int area = 0;
        int[] newHeights = new int[len+2];
        for(int i = 0;i < len; i++){
            newHeights[i+1] = heights[i];
        }
        heights = newHeights;
        len = len+2;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1;i < len; i++){
            while(heights[stack.peek()] > heights[i]){
                int height = heights[stack.pop()];
                int width = i - stack.peek() -1 ;
                area = Math.max(area,height*width);
            }
            stack.push(i);
        }
        return area;
    }
}
