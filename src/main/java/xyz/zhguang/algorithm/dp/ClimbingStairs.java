package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs/">爬楼梯</a>
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int first = 1;int second = 2;
        int result = 0;
        for (int i = 3;i <= n;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
