package edu.baekjoon.LV_02_조건문;

import java.util.Scanner;

public class LV_02_04_14681 {
    public static void main(String[] args) {

        LV_02_04_14681 sol = new LV_02_04_14681();
        System.out.println(sol.solution());
    }

    public int solution(){
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int result = 0;

        if(x > 0){
            result = (y > 0) ? 1 :  4;
        } else {
            result = (y > 0) ? 2 :  3;
        }
        sc.close();

        return result;
    }
}
