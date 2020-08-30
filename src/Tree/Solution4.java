package Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/30 11:48 上午
 */
public class Solution4 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root == null){
            return output;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for(Node item : node.children){
                if(item != null){
                    stack.add(item);
                }
            }
        }
        return output;
    }
}
