package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/30 9:47 下午
 */
public class Solution9 {
    //title:https://leetcode-cn.com/problems/two-sum/submissions/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> targetMap = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int newTarget = target - nums[i];
            if(targetMap.containsKey(newTarget)){
                return new int[]{targetMap.get(newTarget),i};
            }
            targetMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
