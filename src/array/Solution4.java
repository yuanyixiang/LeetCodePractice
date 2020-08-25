package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/23 10:07 下午
 */
public class Solution4 {
    //title://[https://leetcode-cn.com/problems/3sum/ ](https://leetcode-cn.com/problems/3sum/)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3){
            return list;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int start = 0;start < len -2;start++){
            int one = start+1;
            int two = len-1;
            if(start > 0 && nums[start] == nums[start-1] ){
                continue;
            }
            while(one < two){
                if(nums[start]+nums[one]+nums[two]==0){
                    List<Integer> numlist = new ArrayList<Integer>();
                    numlist.add(nums[start]);
                    numlist.add(nums[one]);
                    numlist.add(nums[two]);
                    list.add(numlist);
                    one++;
                    two--;
                    while(one < two && nums[one] == nums[one-1] ){
                        one++;
                    }
                    while(one < two && nums[two] == nums[two+1]){
                        two--;
                    }
                }else if(nums[start]+nums[one]+nums[two] >0){
                    two --;
                }else{
                    one ++;
                }
            }
        }
        return list;
    }
}
