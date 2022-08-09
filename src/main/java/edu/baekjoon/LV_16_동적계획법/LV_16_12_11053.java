package edu.baekjoon.LV_16_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class LV_16_12_11053 {

    public static Integer[] dp;
    public static int[] arr;
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new Integer[N];
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            findMax(i);
        }
        System.out.println(Arrays.toString(dp));
        Arrays.sort(dp);
        System.out.println(dp[dp.length-1]);
        sc.close();
    }

    public static int findMax(int in){
        if(dp[in] == null){
            dp[in] = 1;
            for(int i = in; i >= 0; i--){
                if(arr[i] < arr[in]){
                    dp[in] = Math.max(dp[in], findMax(i)+1);
                }
            }
        }
        return dp[in];
    }
}
