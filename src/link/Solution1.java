package link;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/24 8:40 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/reverse-linked-list/submissions/
    class ListNode{
        ListNode next;
    }
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                head = curr.next;
                curr.next = prev;
                prev = curr;
                curr = head;
            }

            return prev;
        }
}
