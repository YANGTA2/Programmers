package com.BAEKJOON.OneDimentionalArray;

import java.util.Scanner;

public class BAEKJOON8958 {

    public static void main(String[] args) {
        BAEKJOON8958 sol = new BAEKJOON8958();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){ 
            String result = sc.next();
            String[] spl = result.split("X");
            
            int totalScore = 0;
            for (String str : spl) {
                int score = (str.length() > 0) ? (str.length()+1)*str.length()/2 : 0;
                totalScore += score;
            }
            System.out.println(totalScore);
        }

        sc.close();
    }
}