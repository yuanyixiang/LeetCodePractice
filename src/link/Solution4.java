package link;

import java.util.concurrent.CountDownLatch;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/25 10:21 下午
 */
public class Solution4 {
    //title:https://leetcode-cn.com/problems/linked-list-cycle-ii/submissions/
     class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
    public ListNode findTogether(ListNode head){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.countDown();
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode one = findTogether(head) ;
        if(one == null){
            return null;
        }
        ListNode two = head;
        while(one != two){
            one = one.next;
            two = two.next;
        }
        return one;
    }
}
