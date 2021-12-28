package com.BAEKJOON.BasicMath1;

import java.util.Scanner;

public class BAEKJOON1193 {
    
    public static void main(String[] args) {
        
        BAEKJOON1193 sol = new BAEKJOON1193();
        System.out.println(sol.solution());
    }
    
    public String solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int cnt = 0;
        String result = "";

        while(n > cnt){
            row++;
            cnt += row;
        }
        
        if(row % 2 == 0){
            result = (n-cnt+row) + "/" + (cnt-n+1);
        } else {
            result = (cnt-n+1) + "/" + (n-cnt+row);
        }

        sc.close();
        return result;
    }
}
