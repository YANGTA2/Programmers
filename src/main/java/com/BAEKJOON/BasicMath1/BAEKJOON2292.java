package com.BAEKJOON.BasicMath1;

import java.util.Scanner;

public class BAEKJOON2292 {
    
    public static void main(String[] args) {
        
        BAEKJOON2292 sol = new BAEKJOON2292();
        System.out.println(sol.solution());
    }
    
    public long solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        int lev = 1;

        while(n > lev){
            lev += 6 * result;
            result++;
        }

        sc.close();
        return result;
    }
}
