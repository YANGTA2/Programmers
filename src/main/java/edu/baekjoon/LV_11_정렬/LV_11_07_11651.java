package edu.baekjoon.LV_11_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class LV_11_07_11651 {

    public static void main(String[] args) throws Exception {
        
        LV_11_07_11651 sol = new LV_11_07_11651();
        sol.solution();
        
    }

    public void solution() throws Exception{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // 람다식으로 Comparator를 구현
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        
        for(int[] a : arr){
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
