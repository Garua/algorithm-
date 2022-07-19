package xyz.zhguang.algorithm.dp;


/**
 * <a href="https://leetcode.cn/problems/house-robber/">打家劫舍</a>
 */
public class HouseRobber {
    public  int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for(int i = 2;i < nums.length;i++){
            int t = second;
            second = Math.max(first+ nums[i],second);
            first = t;
        }

        return second;
    }
}
