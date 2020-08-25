package link;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/25 5:44 下午
 */
public class Solution3 {
    //title:https://leetcode-cn.com/problems/linked-list-cycle/
    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
