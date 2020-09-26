package dfsorbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/19 3:09 下午
 */
public class Solution3 {
    //title:https://leetcode-cn.com/problems/generate-parentheses/submissions/
    public List<String> generateParenthesis(int n) {
        List<String> parent = new ArrayList<>();
        generate(0,0,n,new StringBuilder(),parent);
        return parent;
    }
    public void generate(int left,int right,int n,StringBuilder s,List<String> parent){
        if((left + right) == n*2){
            parent.add(s.toString());
            return ;
        }
        if(left < n ){
            s.append("(");
            generate(left+1,right,n,s,parent);
            s.deleteCharAt(s.length()-1);
        }

        if(right < left ){
            s.append(")");
            generate(left,right+1,n,s,parent);
            s.deleteCharAt(s.length()-1);
        }
        Queue queue = new LinkedList();
    }
}
