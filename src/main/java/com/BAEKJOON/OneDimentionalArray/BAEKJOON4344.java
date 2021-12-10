package com.BAEKJOON.OneDimentionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class BAEKJOON4344 {

    public static void main(String[] args) {
        BAEKJOON4344 sol = new BAEKJOON4344();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        for(int i = 0; i < c; i++){ 
            int n = sc.nextInt();

            ArrayList<Integer> scoreArr = new ArrayList<>();
            int totalScore = 0;
            for(int j = 0; j < n; j++){
                int score = sc.nextInt();
                scoreArr.add(score);
                totalScore += score;
            }
            double avg = totalScore/n;
            double cnt = 0;
            for(Integer s : scoreArr){
                if((double)s > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",cnt/(double)n*100);
        }
        sc.close();
    }
}