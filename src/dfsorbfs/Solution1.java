package dfsorbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/18 10:42 上午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/binary-tree-level-order-traversal/submissions/
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if(root == null){return list;}
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int currSize = queue.size();
            for(int i = 0;i < currSize ; i++){
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            list.add(levelList);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
