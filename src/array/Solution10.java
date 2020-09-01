package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/30 10:04 下午
 */
public class Solution10 {
    //title:https://leetcode-cn.com/problems/plus-one/submissions/
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
