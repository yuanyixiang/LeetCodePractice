package divide;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/9/11 1:10 下午
 */
public class Solution1 {
    //title:https://leetcode-cn.com/problems/powx-n/
    public double myPow(double x, long n) {
        long N = n;
        return N>=0 ? pow(x,n) : (1.0/pow(x,-n));
    }
    public double pow(double x,long n){
        double ans = 1.0;

        double x_contribute = x;

        while(n > 0){
            if( n % 2 == 1){
                ans *= x_contribute;
            }
            x_contribute *= x_contribute;
            n = n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer>  curr = new ArrayList<>();
        curr.add(1);
        List<List<Integer>> newSubsets = new ArrayList();
        newSubsets.add(new ArrayList<Integer>(curr){{add(1);}});
    }
}
