package com.BAEKJOON.Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BAEKJOON2751 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON2751 sol = new BAEKJOON2751();
        sol.solution();
        
    }

    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(arr);
        for(int num : arr){
            sb.append(num).append("\n");
        }
        
        System.out.println(sb);
    }

    /*
    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        // arr 배열에 입력 수 추가
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        

        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);
        for(int num : arr){
            sb.append(num).append("\n");
        }
        
        System.out.println(sb);
    }
    */
    
}
