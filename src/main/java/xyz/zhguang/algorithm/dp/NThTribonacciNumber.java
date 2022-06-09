package xyz.zhguang.algorithm.dp;

/**
 * <a href="https://leetcode.cn/problems/n-th-tribonacci-number/">...</a>
 */
public class NThTribonacciNumber {
    public static int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n ==1 || n==2){
            return 1;
        }
        int first = 0;int second =1;int third =1;
        int result = 2;
        for(int i =3;i <= n;i++){
            result = first + second + third;
            first =second;
            second = third;
            third =result;
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
