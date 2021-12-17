package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON11720 {
    
    public static void main(String[] args) {
        
        BAEKJOON11720 sol = new BAEKJOON11720();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int result = 0;

        for(int i = 0; i < str.length(); i++){
            result += str.charAt(i) - '0';
        }
        sc.close();

        return result;
    }
}
