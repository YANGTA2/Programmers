package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON11654 {
    
    public static void main(String[] args) {
        
        BAEKJOON11654 sol = new BAEKJOON11654();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        int result = sc.next().charAt(0);
        sc.close();

        return result;
    }
}
