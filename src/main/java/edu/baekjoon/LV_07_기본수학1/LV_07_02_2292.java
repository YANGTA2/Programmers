package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class LV_07_02_2292 {
    
    public static void main(String[] args) {
        
        LV_07_02_2292 sol = new LV_07_02_2292();
        System.out.println(sol.solution());
    }
    
    public long solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        int lev = 1;

        while(n > lev){
            lev += 6 * result;
            result++;
        }

        sc.close();
        return result;
    }
}
