package com.BAEKJOON.OneDimentionalArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BAEKJOON1546 {

    public static void main(String[] args) {
        BAEKJOON1546 sol = new BAEKJOON1546();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        double maxScore = arr.get(arr.size()-1);
        double totalScore = 0;
        
        for(int i = 0; i < arr.size(); i++){
            totalScore += (arr.get(i) / maxScore)*100;
        }

        System.out.println(totalScore/n);
        
        sc.close();
    }
}