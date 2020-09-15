package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/4 11:34 上午
 */
public class Solution4 {
    //title:https://leetcode-cn.com/problems/permutations/submissions/
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            output.add(nums[i]);
        }
        combine(n,0,res,output);
        return res;
    }
    public void combine(int n,int first,List<List<Integer>> res,List<Integer> output){
        if(first == n){
            res.add(new ArrayList(output));
            return;
        }
        for(int i = first;i < n;i++){
            Collections.swap(output,first,i);
            combine(n,first+1,res,output);
            Collections.swap(output,first,i);
        }
    }
}
