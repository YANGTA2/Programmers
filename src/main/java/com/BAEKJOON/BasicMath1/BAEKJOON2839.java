package com.BAEKJOON.BasicMath1;

import java.util.Scanner;

public class BAEKJOON2839 {
    
    public static void main(String[] args) {
        
        BAEKJOON2839 sol = new BAEKJOON2839();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = -1;
        
        if(n == 4 || n == 7){
            result = -1;
        } else if(n % 5 == 0){
            result = n / 5;
        } else if(n % 5 == 1 || n % 5 == 3){
            result = n / 5 + 1; 
        } else if(n % 5 == 2 || n % 5 == 4){
            result = n / 5 + 2;
        }
        sc.close();

        return result;
    }
}
