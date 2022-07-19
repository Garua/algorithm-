package xyz.zhguang.algorithm.dp;


import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/house-robber-ii/">打家劫舍 II</a>
 *
 * <a href="https://leetcode.cn/problems/house-robber-ii/solution/213-da-jia-jie-she-iidong-tai-gui-hua-jie-gou-hua-/">...</a>
 *
 * 环状排列意味着第一个房子和最后一个房子中只能选择一个偷窃，因此可以把此环状排列房间问题约化为两个单排排列房间子问题：
 *
 * 在不偷窃第一个房子的情况下（即 nums[1:]nums[1:]），最大金额是 p_1p
 * 1
 *   ；
 * 在不偷窃最后一个房子的情况下（即 nums[:n-1]nums[:n−1]），最大金额是 p_2p
 * 2
 。
 * 综合偷窃最大金额： 为以上两种情况的较大值，即 max(p1,p2)max(p1,p2) 。
 *
 */
public class HouseRobberII {

    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int myRob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }

}
