package dfsorbfs;

import java.util.*;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/23 10:35 下午
 */
public class Solution5 {
    //title:https://leetcode-cn.com/problems/word-ladder/description/
    int change = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList);
        if(wordSet.size() == 0 || !wordSet.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        int step = 1;
        while(!queue.isEmpty()){
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String currentWord = queue.poll();
                if(findLength(currentWord,endWord,queue,visited,wordSet)){
                    return step+1;
                }
            }
            step++;
        }
        return 0;
    }
    public boolean findLength(String currentWord, String endWord,
                              Queue<String> queue, Set<String> visited, Set<String> wordSet){
        char[] begin = currentWord.toCharArray();
        for(int i = 0; i < endWord.length();i++){
            char saveBegin = begin[i];
            for(char c = 'a' ;c <= 'z';c++){
                begin[i] = c;
                if(c == saveBegin){
                    continue;
                }
                String s = String.valueOf(begin);
                if(wordSet.contains(s)){
                    if(s.equals(endWord)){
                        return true;
                    }
                    if(!visited.contains(s)){
                        queue.offer(s);
                        visited.add(s);
                    }
                }
            }
            begin[i] = saveBegin;
        }
        return false;
    }
}
