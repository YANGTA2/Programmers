package com.BAEKJOON.IF;

import java.util.Scanner;

public class BAEKJOON2884 {
    
    public static void main(String[] args) {
        
        BAEKJOON2884 sol = new BAEKJOON2884();
        System.out.println(sol.solution());
    }

    /* 
        [python]
        date.time 객체 생성 및 datetime 객체로 combine
        해당 datetime 객체에서 -45minute 이후 hour, minute 을 가져오는 풀이도 있다.
    */
    
    public String solution(){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m - 45 >= 0){
            m -= 45;
        } else {
            m = 60 - 45 + m;
            h = ( h - 1 >= 0) ? --h : 23;
        }
        sc.close();
        
        return h + " " + m;
    }
}
