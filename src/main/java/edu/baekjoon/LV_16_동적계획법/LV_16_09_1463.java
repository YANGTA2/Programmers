package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_09_1463 {

    public static int N;
    public static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new Integer[N+1];
        dp[0] = dp[1] = 0;
        System.out.println(findMin(N));
        sc.close();
    }

    public static int findMin(int in){
        if(dp[in] == null){
            if(in % 6 == 0){
                dp[in] = Math.min(Math.min(findMin(in / 3), findMin(in / 2)), findMin(in - 1)) + 1;
            } else if(in % 3 == 0){
                dp[in] = Math.min(findMin(in / 3), findMin(in - 1)) + 1;
            } else if(in % 2 == 0){
                dp[in] = Math.min(findMin(in / 2), findMin(in - 1)) + 1;
            } else {
                dp[in] = findMin(in - 1) + 1;
            }
        }
        return dp[in];
    }
}
