package edu.baekjoon.LV_13_기하1;

import java.util.Scanner;

public class LV_13_01_1085 {
    
    public static void main(String[] args) {
        
        LV_13_01_1085 sol = new LV_13_01_1085();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minWidth = (x > w-x) ? w-x : x;
        int minHeight = (y > h-y) ? h-y : y;

        if(minWidth > minHeight){
            System.out.println(minHeight);
        } else {
            System.out.println(minWidth);
        }
        
        sc.close();
    }
}
