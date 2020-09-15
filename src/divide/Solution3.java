package divide;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/15 12:19 下午
 */
public class Solution3 {
    //title:https://leetcode-cn.com/problems/majority-element/
    public int majorityElement(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    public int countNums(int[] nums,int flag,int lo,int hi){
        int count=0;
        for(int i = lo ;i <= hi;++i){
            if(nums[i] == flag){
                ++count;
            }
        }
        return count;
    }
    public int divide(int[] nums,int lo,int hi){
        if(lo == hi){
            Map<Integer,Integer> map = new HashMap<>();
            for(Map.Entry entry : map.entrySet()){
                entry.getKey();
            }
            return nums[lo];

        };
        int mid = lo + (hi - lo)/2;
        int left = divide(nums,lo,mid);
        int right = divide(nums,mid+1,hi);
        if(left == right){
            return left;
        }
        int leftcount = countNums(nums,left,lo,hi);
        int rightcount = countNums(nums,right,lo,hi);
        return leftcount > rightcount ? left : right;
    }
}
