package edu.baekjoon.LV_12_집합과맵;

import java.util.Arrays;
import java.util.Scanner;

public class LV_12_01_10815 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);        
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++){
            int tempNum = sc.nextInt();
            sb.append(binarySearch(arr, N, tempNum) + " ");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
    
    public static int binarySearch(int[] arr, int N, int searchNum){
        int start = 0;
        int end = N-1;
        int mid = 0;

        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid] == searchNum){
                return 1;
            }

            if(arr[mid] < searchNum){
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
