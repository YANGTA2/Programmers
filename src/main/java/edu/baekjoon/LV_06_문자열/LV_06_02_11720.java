package edu.baekjoon.LV_06_문자열;

import java.util.Scanner;

public class LV_06_02_11720 {
    
    public static void main(String[] args) {
        
        LV_06_02_11720 sol = new LV_06_02_11720();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        /* int n = */ sc.nextInt();
        String str = sc.next();
        int result = 0;

        for(int i = 0; i < str.length(); i++){
            result += str.charAt(i) - '0';
        }
        sc.close();

        return result;
    }
}
