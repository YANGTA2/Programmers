package com.BAEKJOON.BasicMath2;

import java.util.Scanner;

public class BAEKJOON1085 {
    
    public static void main(String[] args) {
        
        BAEKJOON1085 sol = new BAEKJOON1085();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minWeight = (x > w-x) ? w-x : x;
        int minHeight = (y > h-y) ? h-y : y;

        if(minWeight > minHeight){
            System.out.println(minHeight);
        } else {
            System.out.println(minWeight);
        }
        
        sc.close();
    }
}
