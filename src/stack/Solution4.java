package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/26 6:43 下午
 */
public class Solution4 {
    //https://leetcode-cn.com/problems/sliding-window-maximum/submissions/
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0)
            return new int[0];
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> qeque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if(!qeque.isEmpty() && qeque.peekFirst() <= i-k){
                qeque.removeFirst();
            }
            while(!qeque.isEmpty() && nums[qeque.peekLast()] < nums[i]){
                qeque.removeLast();
            }
            qeque.addLast(i);
            if(i >= k-1){
                res[index++] = nums[qeque.peekFirst()];
            }
        }
        return res;
    }
}
