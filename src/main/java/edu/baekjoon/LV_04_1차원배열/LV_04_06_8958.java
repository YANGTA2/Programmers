package edu.baekjoon.LV_04_1차원배열;

import java.util.Scanner;

public class LV_04_06_8958 {

    public static void main(String[] args) {
        LV_04_06_8958 sol = new LV_04_06_8958();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){ 
            String result = sc.next();
            String[] split = result.split("X");
            
            int totalScore = 0;
            for (String str : split) {
                int score = (str.length() > 0) ? (str.length()+1)*str.length()/2 : 0;
                totalScore += score;
            }
            System.out.println(totalScore);
        }
        sc.close();
    }
}