package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/23 9:42 下午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/move-zeroes/submissions/
    public void moveZeroes(int[] nums) {
        for(int i = 0, j = 0;i < nums.length ;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
