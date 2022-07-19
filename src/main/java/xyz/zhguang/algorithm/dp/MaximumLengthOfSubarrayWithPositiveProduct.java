package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/maximum-length-of-subarray-with-positive-product/">乘积为正数的最长子数组长度</a>
 */
public class MaximumLengthOfSubarrayWithPositiveProduct {

    public static void main(String[] args) {

    }

    public int getMaxLen(int[] nums) {
        //  positive[i]代表以下标i结尾的乘积为正数的最长子数组，
        // negative[i]代表以下标i结尾的乘积为负数的最长子数组长度，考虑负责，因为负负得正
        int[] positive = new int[nums.length];
        int[] negative = new int[nums.length];
        // 0即不是正数也不是负数，所以...
        if (nums[0] > 0){
            positive[0] = 1;
        }else if(nums[0] < 0){
            negative[0] = 1;
        }
        int maxLen = positive[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > 0){
                positive[i] = positive[i-1] + 1;
                // 这是因为当 negative[i-1]=0 negative[i−1]=0 时
                // negative[i]本身无法形成一个乘积为正数的子数组，所以要特殊判断

                negative[i] = negative[i-1]>0?negative[i-1]+1:0;
            }else if(nums[i] <  0){
                negative[i] = negative[i-1]+1;
                // 负数，会改变乘积的正负性，
                positive[i] = negative[i-1]>0?negative[i-1]+1:0;
                //  negative 里面存放的乘积为负数的最长子数组长度
                negative[i] = positive[i-1]+1;
            }else{
                negative[i] = 0;
                positive[i] = 0;
            }
            maxLen = Math.max(maxLen,positive[i]);
        }


        return maxLen;
    }


}
