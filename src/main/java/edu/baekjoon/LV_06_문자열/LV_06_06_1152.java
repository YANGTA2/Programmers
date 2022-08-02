package edu.baekjoon.LV_06_문자열;

import java.util.Scanner;

public class LV_06_06_1152 {
    
    public static void main(String[] args) {
        
        LV_06_06_1152 sol = new LV_06_06_1152();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        String[] split = word.trim().split(" ");
        
        int result = 0;
        if(split[0] != ""){
            result = split.length;
        }
        
        sc.close();
        return result;
    }
}
