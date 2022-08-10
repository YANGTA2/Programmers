package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_12_11054 {

    public static Integer[] up;
    public static Integer[] down;
    public static int[] arr;
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        up = new Integer[N];
        down = new Integer[N];
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            findMaxUp(i);
            findMaxDown(N-1-i);
        }

        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < up.length; i++){
            if(maxVal < up[i] + down[i]){
                maxVal = up[i] + down[i];
            }
        }
        System.out.println(maxVal - 1);
        sc.close();
    }

    public static int findMaxUp(int in){
        if(up[in] == null){
            up[in] = 1;
            for(int i = in; i >= 0; i--){
                if(arr[i] < arr[in]){
                    up[in] = Math.max(up[in], findMaxUp(i)+1);
                }
            }
        }
        return up[in];
    }

    public static int findMaxDown(int in){
        if(down[in] == null){
            down[in] = 1;
            for(int i = in; i < N; i++){
                if(arr[i] < arr[in]){
                    down[in] = Math.max(down[in], findMaxDown(i)+1);
                }
            }
        }
        return down[in];
    }
}
