package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/fibonacci-number/">斐波那契数</a>
 */
public class FibonacciNumber {


    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int first = 0,second = 1;
        int result = 1;
        for(int i =2;i <= n;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
