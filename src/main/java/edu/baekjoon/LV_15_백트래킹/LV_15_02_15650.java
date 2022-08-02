package edu.baekjoon.LV_15_백트래킹;

import java.util.Scanner;

public class LV_15_02_15650 {
    
    public static int[] arr;
    public static int n, m;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
    
        sc.close();
        
        arr = new int[m];
        
        LV_15_02_15650 sol = new LV_15_02_15650();
        sol.solution(1, 0);
        
    }
    
    public void solution(int startNum, int depth){
        if(depth == m){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = startNum; i <= n; i++){
            arr[depth] = i;
            solution(i + 1, depth + 1);
        }
    }
}
