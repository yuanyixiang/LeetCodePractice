package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/29 8:24 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/binary-tree-inorder-traversal/submissions/
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
        if(root.left != null){
            helper(root.left,res);
        }
        res.add(root.val);
        if(root.right != null ){
            helper(root.right,res);
        }
    }
}
