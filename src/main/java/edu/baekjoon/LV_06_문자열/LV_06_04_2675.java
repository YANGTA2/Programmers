package edu.baekjoon.LV_06_문자열;

import java.util.Scanner;

public class LV_06_04_2675 {
    
    public static void main(String[] args) {
        
        LV_06_04_2675 sol = new LV_06_04_2675();
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
