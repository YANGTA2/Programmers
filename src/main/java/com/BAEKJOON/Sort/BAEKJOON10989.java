package com.BAEKJOON.Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON10989 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON10989 sol = new BAEKJOON10989();
        sol.solution();
        
    }

    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        
        for(int i = 0; i < n; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);

        /*  --! 메모리초과
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);
        
        for(int num : arr){
            System.out.println(num);
        }
        */
    }
}
