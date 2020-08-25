package link;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/24 9:28 下午
 */
public class Solution2 {
    //title:https://leetcode.com/problems/swap-nodes-in-pairs
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode last = prev;
        head = prev.next;
        while(prev != null && prev.next != null){
            ListNode curr = prev.next;
            last.next = curr;
            prev.next = curr.next;
            curr.next = prev;
            last = prev;
            prev = prev.next;
        }
        ReentrantLock reentrantLock = new ReentrantLock();
        return head;
    }
}
