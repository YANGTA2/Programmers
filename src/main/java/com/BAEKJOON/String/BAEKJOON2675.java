package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON2675 {
    
    public static void main(String[] args) {
        
        BAEKJOON2675 sol = new BAEKJOON2675();
        System.out.println(sol.solution());
    }
    
    public String solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        
        for(int i = 0; i < n; i++){
            int cnt = sc.nextInt();
            String str = sc.next();
            for(int a = 0; a < str.length(); a++){
                for(int b = 0; b < cnt; b++){
                    result += str.charAt(a);
                }
            }
            result += "\n";
        }
        sc.close();

        return result;
    }
}
