package greedy;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/26 2:53 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/lemonade-change/submissions/
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
