package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/delete-and-earn/">删除并获得点数</a>
 *
 *
 * <a href="https://leetcode.cn/problems/delete-and-earn/solution/zhe-xiao-tou-you-lai-qiang-jie-liao-ta-z-w29x/">...</a>
 * <a href="https://leetcode.cn/problems/delete-and-earn/solution/ru-guo-ni-li-jie-liao-da-jia-jie-she-zhe-ti-ni-ken/">...</a>
 *
 * 在选择了元素 x 后，该元素以及所有等于 x-1 或 x+1 的元素会从数组中删去。
 * 若还有多个值为 x 的元素，由于所有等于 x−1 或 x+1 的元素已经被删除，我们可以直接删除 x 并获得其点数。
 * 因此若选择了 x，所有等于 x 的元素也应一同被选择，以尽可能多地获得点数。
 *
 *
 */
public class DeleteAndEarn {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,3,4};
        new DeleteAndEarn().deleteAndEarn(arr);
    }
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(num,maxVal);
        }
        int[] sum = new int[maxVal+1];
        for (int num : nums) {
            sum[num] += num;
        }
        // [2,2,3,3,3,4]  --> [0,0,4,9,4,0]  就类似于打家劫舍，不能偷相邻的
        return myrob(sum);
    }
    public int myrob(int []nums){
        int first = nums[0];
        int second = Math.max(nums[1],nums[0]);
        int temp;
        for (int i = 2;i < nums.length;i++) {
            temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }


}
