package com.BAEKJOON.RecursiveFunction;

import java.util.Scanner;

public class BAEKJOON10870 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        BAEKJOON10870 sol = new BAEKJOON10870();
        System.out.println(sol.solution(n));
        
    }
    
    public int solution(int input){
        if(input == 0) return 0;
        else if(input == 1) return 1;
        else {
            return solution(input-2) + solution(input-1);
        }
    }
}
