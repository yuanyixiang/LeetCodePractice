package recursion;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/2 3:02 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public class TreeNode {
         int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
    TreeNode node = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root,p,q);
        return node;
    }
    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return false;
        }
        boolean lson = helper(root.left,p,q);
        boolean rson = helper(root.right,p,q);
        if((lson && rson) || ((root.val == p.val|| root.val == q.val)&&(lson || rson)))        {
            node = root;
        }
        return lson || rson || (root.val == p.val|| root.val == q.val);
    }
}
