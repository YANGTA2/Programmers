package com.BAEKJOON.BruteForce;

import java.util.Scanner;

public class BAEKJOON2798 {
    
    public static void main(String[] args) {
        
        BAEKJOON2798 sol = new BAEKJOON2798();
        System.out.println(sol.solution());
        
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] > m) continue;

            for(int j = i+1; j < n; j++){

                if(arr[i] + arr[j] > m) continue;

                for(int k = j+1; k < n; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp == m){
                        return temp;
                    }

                    if(temp > result && temp < m){
                        result = temp;
                    }
                }
            }
        }
        sc.close();

        return result;
    }
}
