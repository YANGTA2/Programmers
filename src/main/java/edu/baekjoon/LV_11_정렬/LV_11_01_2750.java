package edu.baekjoon.LV_11_정렬;

import java.util.Scanner;

public class LV_11_01_2750 {

    public static void main(String[] args) {
        
        LV_11_01_2750 sol = new LV_11_01_2750();
        sol.solution();
        
    }

    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        // arr 배열에 입력 수 추가
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        int temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
