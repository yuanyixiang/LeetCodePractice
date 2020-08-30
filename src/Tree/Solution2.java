package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/29 8:24 下午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/binary-tree-preorder-traversal/submissions/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        if(root.left != null){
            helper(root.left,res);
        }
        if(root.right != null ){
            helper(root.right,res);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> output = new LinkedList<>();

        output.addFirst(1);
        output.addFirst(2);

        System.out.println(output.pollLast());
        System.out.println(output.pollLast());

    }
}
