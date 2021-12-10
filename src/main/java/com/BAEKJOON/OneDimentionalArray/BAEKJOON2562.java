package com.BAEKJOON.OneDimentionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class BAEKJOON2562 {

    public static void main(String[] args) {
        BAEKJOON2562 sol = new BAEKJOON2562();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            int num = sc.nextInt();
            arr.add(num);

            if(num > max){
                max = num;
            }
        }
        sc.close();
        
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}