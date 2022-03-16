package com.BAEKJOON.Sort;

import java.util.Scanner;

public class BAEKJOON1427 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON1427 sol = new BAEKJOON1427();
        sol.solution();
        
    }

    public void solution() throws Exception{
        
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int[] arr = new int[10];
        sc.close();

        for(int i = 0; i < n.length(); i++){
            int num = n.charAt(i)-'0';
            arr[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < arr[i]; j++){
                sb.append(i);
            }
        }
        

        System.out.println(sb);
        
    }
}
