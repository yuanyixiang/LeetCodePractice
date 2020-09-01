package hash;

import java.util.*;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/1 7:00 下午
 */
public class Solution2 {
    //title:https://leetcode-cn.com/problems/group-anagrams/submissions/
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s_arr = strs[i].toCharArray();
            //排序
            Arrays.sort(s_arr);
            //映射到 key
            String key = String.valueOf(s_arr);
            //添加到对应的类中
            if (hash.containsKey(key)) {
                hash.get(key).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                hash.put(key, temp);
            }
            LinkedList linkedList = new LinkedList();
            linkedList.getFirst();

        }
        return new ArrayList<List<String>>(hash.values());
    }
}
