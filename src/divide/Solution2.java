package divide;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/14 3:20 下午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/subsets/
    List<List<Integer>> subset = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        recursion(0,nums.length,nums,new ArrayList());
        return subset;
    }

    public void recursion(int index,int n,int[] nums,List<Integer> list){
        if(index == n){
            subset.add(new ArrayList(list));
            return;
        }
        recursion(index+1,n,nums,list);
        list.add(nums[index]);
        recursion(index+1,n,nums,list);

        list.remove(list.size()-1);
    }
}
