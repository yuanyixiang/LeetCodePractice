package divide;

import java.util.*;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/16 10:21 上午
 */
public class Solution4 {
    //title:https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/submissions/
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }

        Map<Character,String> save = new HashMap<Character,String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        rebacksave(save,digits,0,new StringBuffer(),combinations);
        return combinations;
    }
    public void rebacksave(Map<Character,String> save,String digits,int index,StringBuffer combination,List<String> combinations){
        if(index == digits.length()){
            combinations.add(combination.toString());
            return ;
        }
        char digit = digits.charAt(index);
        String combine = save.get(digit);
        int count = combine.length();
        for(int i = 0 ; i < count ; ++i){
            combination.append(combine.charAt(i));
            rebacksave(save,digits,index+1,combination,combinations);
            combination.deleteCharAt(index);
        }
    }

}

