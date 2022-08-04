package edu.baekjoon.LV_15_백트래킹;

import java.util.Scanner;

public class LV_15_08_14889 {
    
    static int minVal = Integer.MAX_VALUE;
    static int N;
    static int playerPerTeam;
    static boolean[] check;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        playerPerTeam = N/2;
        check = new boolean[N];
        arr = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0);
        System.out.println(minVal);
        sc.close();
    }

    public static void dfs(int idx, int depth){
        if(depth == playerPerTeam){
            int start = 0;
            int link = 0;
            for(int i = 0; i < N; i++){
                for(int j = i+1; j < N; j++){
                    if(check[i] && check[j]){
                        start += arr[i][j];
                        start += arr[j][i];
                    } else if (!check[i] && !check[j]){
                        link += arr[i][j];
                        link += arr[j][i];
                    }
                }
            }
            minVal = Math.min(minVal, Math.abs(start - link));
            return;
        }

        for(int i = idx; i < N; i++){
            if(!check[i]){   
                check[i] = true;
                dfs(i + 1, depth+1);
                check[i] = false;
            }
        }
    }
}

