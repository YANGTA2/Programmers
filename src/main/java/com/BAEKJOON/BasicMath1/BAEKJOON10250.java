package com.BAEKJOON.BasicMath1;

import java.util.Scanner;

public class BAEKJOON10250 {
    
    public static void main(String[] args) {
        
        BAEKJOON10250 sol = new BAEKJOON10250();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int y = n % h;
            int x = n / h;

            if(y == 0){
                System.out.println( h * 100 + x);
            } else {
                System.out.println( y * 100 + x + 1);
            }

        } 
        sc.close();
    }
}
