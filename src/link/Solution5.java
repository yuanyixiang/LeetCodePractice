package link;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/27 7:14 下午
 */
public class Solution5 {
    //https://leetcode-cn.com/problems/reverse-nodes-in-k-group/submissions/
       public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode end = dummy;
        while(end.next != null){
            for(int i = k;end != null&&i>0;i--) end = end.next;
            if(end == null){break;}
            ListNode start = prev.next;
            ListNode next = end.next;
            end.next = null;
            prev.next = reverse(start);
            start.next = next;
            prev = start;
            end = start;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
