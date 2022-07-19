package xyz.zhguang.algorithm.dp;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/maximum-sum-circular-subarray/"> 环形子数组的最大和</a>
 *
 * <a href="https://leetcode.cn/problems/maximum-sum-circular-subarray/solution/wo-hua-yi-bian-jiu-kan-dong-de-ti-jie-ni-892u/">题解</a>
 */
public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] mergeArr = new int[]{5,-3,5};
        System.out.println(maxSubarraySumCircular(mergeArr));
    }

    public static int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax+a,a);
            maxSum = Math.max(curMax,maxSum);
            curMin = Math.min(curMin+a,a);
            minSum = Math.min(minSum,curMin);
            total += a;
        }

        return maxSum > 0?Math.max(maxSum,total-minSum):maxSum;
    }


}
