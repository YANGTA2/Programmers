package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class LV_07_03_1193 {
    
    public static void main(String[] args) {
        
        LV_07_03_1193 sol = new LV_07_03_1193();
        System.out.println(sol.solution());
    }
    
    public String solution(){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int cnt = 0;
        String result = "";

        while(n > cnt){
            row++;
            cnt += row;
        }
        
        if(row % 2 == 0){
            result = (n-cnt+row) + "/" + (cnt-n+1);
        } else {
            result = (cnt-n+1) + "/" + (n-cnt+row);
        }

        sc.close();
        return result;
    }
}
