package hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/31 8:11 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/valid-anagram/submissions/
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        char[] flag = new char[26];
        for(int i = 0 ; i < ss.length ;i++){
            flag[ss[i] - 97]++;
            flag[tt[i] - 97]--;
        }
        for(int i = 0; i < 26 ;i++){
            if(flag[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, List> map = new HashMap<>();
        
    }
}
