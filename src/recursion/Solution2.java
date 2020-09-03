package recursion;

import java.util.HashMap;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/3 11:06 上午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
    HashMap<Integer,Integer> index = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for(int i = 0;i < n;i++){
            index.put(inorder[i],i);
        }
        TreeNode root = builderTree(preorder,inorder,0,n-1,0,n-1);
        return root;
    }
    public TreeNode builderTree(int[] preorder, int[] inorder,int p_start,int p_end,int i_start,int i_end){
        if(p_start > p_end){
            return null;
        }
        int inorder_root = index.get(preorder[p_start]);
        TreeNode root = new TreeNode(inorder[inorder_root]);
        int off_incorder = inorder_root - i_start;
        root.left = builderTree(preorder, inorder,p_start+1,p_start+off_incorder,i_start,inorder_root-1);
        root.right = builderTree(preorder,inorder,p_start+off_incorder+1,p_end,inorder_root+1,i_end);
        return root;
    }
}
