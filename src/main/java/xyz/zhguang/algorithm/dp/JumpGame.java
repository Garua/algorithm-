package xyz.zhguang.algorithm.dp;


/**
 * <a href="https://leetcode.cn/problems/jump-game/">跳跃游戏</a>
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > t){
                return false;
            }
            t = Math.max(i+nums[i],t);
        }

        return true;
    }
}
