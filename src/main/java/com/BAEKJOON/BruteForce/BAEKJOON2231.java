package com.BAEKJOON.BruteForce;

import java.util.Scanner;

public class BAEKJOON2231 {

    public static void main(String[] args) {
        
        BAEKJOON2231 sol = new BAEKJOON2231();
        System.out.println(sol.solution());
        
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        /* int m = */ sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        sc.close();

        for(int i = 0; i < n; i++){
            
            int temp = 0;
            int num = i;

            while(num != 0){
                temp += num % 10;
                num /= 10;
            }

            if(temp + i == n){
                result = i;
                break;
            }
        }
        
        return result;
    }
}
