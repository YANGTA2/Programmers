package edu.baekjoon.LV_13_기하1;

import java.util.Scanner;

public class LV_13_05_3053 {
    
    public static void main(String[] args) {
        
        LV_13_05_3053 sol = new LV_13_05_3053();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        double pi = Math.PI;
        
        // 유클리드 값
        System.out.println(Math.pow(r, 2)*pi);
        
        // 택시 기하학 값
        // double taxiR = Math.sqrt(Math.pow(r, 2)*2);
        // System.out.println(Math.pow(taxiR, 2));
        System.out.println(r*r*2);

        sc.close();
    }
}
