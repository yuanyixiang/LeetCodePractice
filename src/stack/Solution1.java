package stack;

import java.util.Stack;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/25 5:12 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/valid-parentheses/
    public boolean isValid(String s) {
        if(s.length() %2 != 0){
            return false;
        }
        Stack<Character> charStack = new Stack<Character>();
        char[] chars = s.toCharArray();
        int j = chars.length;
        for(int i = 0 ; i < j; i++){
            if(chars[i] == '('){charStack.push(')');}
            else if(chars[i] == '{') {charStack.push('}');}
            else if(chars[i] == '[') {charStack.push(']');}
            else if(chars[i] == ' ') {continue;}
            else if(charStack.isEmpty() || chars[i] != charStack.pop()){
                return false;
            }
        }
        return charStack.isEmpty();
    }
}
