package edu.baekjoon.LV_15_백트래킹;

import java.util.Scanner;

public class LV_15_05_9663 {
    
    public static int[] arr;
    public static int n, cnt;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        sc.close();

        arr = new int[n];
        cnt = 0;

        LV_15_05_9663 sol = new LV_15_05_9663();
        sol.solution(0);

        System.out.println(cnt);
        
    }
    
    public void solution(int depth){
        if(depth == n){
            cnt++;
            return;
        }

        for(int i = 0; i < n; i++){ 
            arr[depth] = i;
            if(checkSpace(depth)){
                solution(depth + 1);
            }
        }
    }

    public boolean checkSpace(int row){ 
        for(int i = 0; i < row; i++){ 
            if(arr[row] == arr[i]){
                // 직선 범위에 있을 경우 false
                return false;
            } else if(Math.abs(row - i) == Math.abs(arr[row] - arr[i])){
                // 대각선 범위에 있을 경우 false
                return false;
            }
        }
        return true;
    }
}