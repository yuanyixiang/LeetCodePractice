package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/4 7:37 下午
 */
public class Solution5 {
    //title:https://leetcode-cn.com/problems/permutations-ii/
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        boolean[] used = new boolean[n];
        combine(nums,n,0,used,res,output);
        return res;
    }
    public void combine(int[] nums,int n,int depth,boolean[] used,List<List<Integer>> res,List<Integer> output){
        if(depth == n){
            res.add(new ArrayList(output));
            return;
        }
        for(int i = 0;i < n;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            output.add(nums[i]);
            used[i] = true;
            combine(nums,n,depth+1,used,res,output);
            output.remove(depth);
            used[i] = false;
        }
    }
}
