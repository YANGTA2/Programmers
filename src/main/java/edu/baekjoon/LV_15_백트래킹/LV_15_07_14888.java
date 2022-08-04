package edu.baekjoon.LV_15_백트래킹;

import java.util.Scanner;

public class LV_15_07_14888 {
    
    static int maxVal = Integer.MIN_VALUE;
    static int minVal = Integer.MAX_VALUE;
    static int N;
    static int[] arr;
    static int[] oper = new int[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            oper[i] = sc.nextInt();
        }

        dfs(arr[0], 1);
        System.out.println(maxVal);
        System.out.println(minVal);

        sc.close();
    }

    public static void dfs(int num, int depth){
        if(depth == N){
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(oper[i] > 0){
                oper[i]--;
                if(i == 0){
                    dfs(num + arr[depth], depth+1);
                }
                if(i == 1){
                    dfs(num - arr[depth], depth+1);
                }
                if(i == 2){
                    dfs(num * arr[depth], depth+1);
                }
                if(i == 3){
                    dfs(num / arr[depth], depth+1);
                }
                oper[i]++;
            }
        }
    }
}

