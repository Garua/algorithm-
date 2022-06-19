package xyz.zhguang.algorithm.dp;


/**
 * <a href="https://leetcode.cn/problems/min-cost-climbing-stairs/">使用最小花费爬楼梯</a>
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int [] cost = new int[] {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    /**
     * cost = [10,15,20]  当处于20所在的位置时，还没到楼梯的最上面，需要花费20前进一步
     * @param cost
     * @return
     */
    public static int minCostClimbingStairs(int[] cost) {
        int down = 0,downdown = 0;
        for (int i = 2; i <=  cost.length; i++) {
            int next = Math.min(downdown+cost[i-2],down+cost[i-1]);
            downdown = down;
            down = next;
        }
        return down;
    }
}
