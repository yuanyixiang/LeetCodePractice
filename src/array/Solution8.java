package array;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/29 12:01 下午
 */
public class Solution8 {
    //title:https://leetcode-cn.com/problems/merge-sorted-array/submissions/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m + n -1;
        while(p1 >=0 && p2>=0){
            if(nums2[p2] > nums1[p1]){
                nums1[p3--] = nums2[p2--];
            }else{
                nums1[p3--] = nums1[p1--];
            }
        }
        while(p2 >= 0){
            nums1[p3--] = nums2[p2--];
        }
    }
}
