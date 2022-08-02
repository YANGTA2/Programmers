package edu.baekjoon.LV_12_집합과맵;

import java.util.HashSet;
import java.util.Scanner;

public class LV_12_02_14425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 공백 제거

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(sc.nextLine());
        }
        
        int resCnt = 0;
        for(int i = 0; i < M; i++){
            if(set.contains(sc.nextLine())){
                resCnt++;
            }
        }
        System.out.println(resCnt);
        sc.close();
    }
}
