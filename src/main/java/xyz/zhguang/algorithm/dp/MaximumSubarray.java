package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/maximum-subarray/">最大子数组和</a>
 *
 *
 * <a href="https://leetcode.cn/problems/maximum-subarray/solution/dong-tai-gui-hua-fen-zhi-fa-python-dai-ma-java-dai/">题解</a>
 */
public class MaximumSubarray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int maxSub = 0,preSub = 0;
        for (int i = 1; i < nums.length; i++) {
            preSub = Math.max(preSub+nums[i],nums[i]);
            maxSub = Math.max(preSub,maxSub);
        }

        return maxSub;
    }
}
