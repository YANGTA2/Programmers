package edu.baekjoon.LV_09_재귀;

import java.util.Scanner;

public class LV_09_05_11729 {
    
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int k = (int)Math.pow(2, n)-1;
        System.out.println(k);

        LV_09_05_11729 sol = new LV_09_05_11729();
        sol.solution(n, 1, 2, 3);
        System.out.println(sb);
    }
    
    public void solution(int n, int a, int b, int c){
        if(n > 0){
            solution(n-1, a, c, b);
            sb.append(a + " " + c + "\n");
            solution(n-1, b, a, c);
        }
    }
}
