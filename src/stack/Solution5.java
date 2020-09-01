package stack;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/31 11:19 上午
 */
public class Solution5 {
    //title:https://leetcode-cn.com/problems/trapping-rain-water/
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int length = height.length;
        int left = 0;
        int right = length -1;
        int leftheight = height[left];
        int rightheight = height[right];
        int sum = 0;
        while(left < right){
            if(leftheight < rightheight){
                if(leftheight > height[left+1]){
                    sum += leftheight - height[left+1];
                }else{
                    leftheight = height[left+1];
                }
                left++;
            }else{
                if(rightheight > height[right-1]){
                    sum += rightheight - height[right-1];
                }else{
                    rightheight = height[right-1];
                }
                right --;
            }
        }
        return sum;
    }
}
