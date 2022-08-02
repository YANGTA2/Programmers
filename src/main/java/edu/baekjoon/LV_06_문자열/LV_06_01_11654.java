package edu.baekjoon.LV_06_문자열;

import java.util.Scanner;

public class LV_06_01_11654 {
    
    public static void main(String[] args) {
        
        LV_06_01_11654 sol = new LV_06_01_11654();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        int result = sc.next().charAt(0);
        sc.close();

        return result;
    }
}
