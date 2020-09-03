package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/3 9:52 下午
 */
public class Solution3 {
    //title:https://leetcode-cn.com/problems/combinations/submissions/
    List<List<Integer>> arraylist = new ArrayList<>();
    int n, k;
    public List<List<Integer>> combine(int n, int k) {
        this.n = n; this.k = k;
        huntcombine(1,new ArrayList<Integer>());
        return arraylist;
    }
    public void huntcombine(int start, ArrayList list){
        if(list.size() == k){
            arraylist.add(new ArrayList(list));
            return ;
        }
        for(int i = start; i <= (n-(k-list.size()-1));i++){
            list.add(i);
            huntcombine(i+1,list);
            list.remove(list.size()-1);
        }
    }
}
