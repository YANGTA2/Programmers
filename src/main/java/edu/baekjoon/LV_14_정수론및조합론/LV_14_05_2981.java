package edu.baekjoon.LV_14_정수론및조합론;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LV_14_05_2981 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < T; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, Comparator.reverseOrder());
        
        int commonGcd = arr.get(0) - arr.get(1);
        for(int i = 1; i < arr.size()-1; i++){
            commonGcd = getGCD(commonGcd, arr.get(i) - arr.get(i+1));
        }

        for(int i = 2; i <= commonGcd; i++){
            if(commonGcd % i == 0){
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }

    public static int getGCD(int A, int B){
        if(B == 0) {
            return A;
        }
        return getGCD(B, A % B);
    }
}
