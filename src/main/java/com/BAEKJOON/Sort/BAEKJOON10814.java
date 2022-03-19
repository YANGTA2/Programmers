package com.BAEKJOON.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BAEKJOON10814 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON10814 sol = new BAEKJOON10814();
        sol.solution();
        
    }

    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[][] arr = new String[n][2];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine().split(" ");
        }

        sc.close();

        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])){
                    return 0;
                }
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
            
        });

        for(String[] str : arr){
            System.out.print(str[0] + " " + str[1] + "\n");
        }

    }
}
