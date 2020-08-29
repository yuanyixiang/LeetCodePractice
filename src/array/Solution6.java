package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/29 10:56 上午
 */
public class Solution6 {
    //title:https://leetcode-cn.com/problems/rotate-array/submissions/
    public void rotate(int[] nums, int k) {
        if(nums == null){
            return;
        }
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums , int start , int end){
        while(start < end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}
