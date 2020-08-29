package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/28 5:07 下午
 */
public class Solution5 {
    //title:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for(int j = i + 1; j < nums.length ;j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }

}
