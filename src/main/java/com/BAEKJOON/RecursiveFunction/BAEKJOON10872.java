package com.BAEKJOON.RecursiveFunction;

import java.util.Scanner;

public class BAEKJOON10872 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        BAEKJOON10872 sol = new BAEKJOON10872();
        System.out.println(sol.solution(n));
        
    }
    
    public int solution(int input){
        if(input <= 1){
            return input * solution(input-1);
        } else {
            return 1;
        }
    }
}
