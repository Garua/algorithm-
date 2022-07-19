package xyz.zhguang.algorithm.dp;


/**x`
 * <a href="https://leetcode.cn/problems/maximum-product-subarray/">.乘积最大子数组</a>
 *
 *
 * <a href="https://leetcode.cn/problems/maximum-product-subarray/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--36/">...</a>
 * 输入: nums = [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int []a = {-4,-3,-2};
        maxProduct1(a);
    }

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        for (int i = 1;i < nums.length;i++) {
            dpMax[i] = Math.max(dpMax[i-1]*nums[i],Math.max(nums[i],dpMin[i-1]*nums[i]));
            dpMin[i] = Math.min(dpMax[i-1]*nums[i],Math.min(nums[i],dpMin[i-1]*nums[i]));
            max = Math.max(max,dpMax[i]);
        }
        return max;
    }

    public static  int maxProduct1(int[] nums) {
        int max = nums[0];
        int dpMax = 0;
        int dpMin = 0;
        dpMax = nums[0];
        dpMin = nums[0];
        for (int i = 1;i < nums.length;i++) {
            int cmax = dpMax;
            int cmin = dpMin;
            dpMax= Math.max(cmax*nums[i],Math.max(nums[i],cmin*nums[i]));
            dpMin = Math.min(cmax*nums[i],Math.min(nums[i],cmin*nums[i]));
            max = Math.max(max,dpMax);
        }
        return max;
    }
}
