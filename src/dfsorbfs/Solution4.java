package dfsorbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/20 5:36 下午
 */
public class Solution4 {
    //title:https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/#/description
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largestList = new ArrayList<>();
        if(root == null){
            return largestList;
        }
        Queue<TreeNode> loop = new LinkedList();
        loop.offer(root);
        while(!loop.isEmpty()){
            int currSize = loop.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0;i < currSize;i++){
                TreeNode node = loop.poll();
                max = Math.max(max,node.val);
                if(node.left != null){
                    loop.offer(node.left);
                }
                if(node.right != null){
                    loop.offer(node.right);
                }
            }
            largestList.add(max);
        }
        return largestList;
    }
}
