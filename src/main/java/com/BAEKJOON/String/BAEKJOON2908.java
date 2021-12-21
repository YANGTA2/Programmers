package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON2908 {
    
    public static void main(String[] args) {
        
        BAEKJOON2908 sol = new BAEKJOON2908();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        BAEKJOON2908 sol = new BAEKJOON2908();

        int a = Integer.parseInt(sol.reverse(sc.next()));
        int b = Integer.parseInt(sol.reverse(sc.next()));
        
        int result = (a>b) ? a : b;
        sc.close();
        return result;
    }

    public String reverse(String input){
        String result = "";
        for(int i = input.length()-1; i >= 0; i--){
            result += input.charAt(i);
        }
        return result;
    }
}
