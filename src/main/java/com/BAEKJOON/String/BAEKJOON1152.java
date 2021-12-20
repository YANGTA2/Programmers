package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON1152 {
    
    public static void main(String[] args) {
        
        BAEKJOON1152 sol = new BAEKJOON1152();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        String[] split = word.trim().split(" ");
        int result = split.length;

        sc.close();
        return result;
    }
}
