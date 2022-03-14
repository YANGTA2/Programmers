package com.BAEKJOON.BruteForce;

import java.util.Scanner;

public class BAEKJOON1436 {

    public static void main(String[] args) {
        
        BAEKJOON1436 sol = new BAEKJOON1436();
        System.out.println(sol.solution());
        
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int startNum = 666;
        int cnt = 1;

        sc.close();

        while(cnt != n){
            startNum++;
            
            if(String.valueOf(startNum).contains("666")){
                cnt++;
            }
        }
        
        return startNum;
    }
}
