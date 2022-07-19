package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/jump-game-ii/">跳跃游戏 II.</a>
 *
 *
 * <a href="https://leetcode.cn/problems/jump-game-ii/solution/45-by-ikaruga/">题解</a>
 */
public class JumpGameII {

    //  [2,3,1,1,4]
    public int jump(int[] nums) {
        int p=nums.length-1,step=0;
        while(p > 0){
            for(int i = 0;i < p;i++){
                if(i+nums[i] >=p){
                    //   顺序寻找最先到达数组最后位置的
                    // [2,3,1,1,4]   顺序寻找最先到达数组最后位置的
                    // 此时把i =3,赋值给p,即原问题变成了 找最少跳跃次数到值为3这个位置的
                    p = i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }

    public int jump1(int[] nums) {
        int p=nums.length-1,step=0,max = 0,end=0;
        for(int i = 0;i < p;i++){
            max = Math.max(i+nums[i],max);
            if(i == end){
                end =max;
                step++;
            }

        }
        return step;
    }
}
