package edu.baekjoon.LV_12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LV_12_04_10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            int tempInt = Integer.parseInt(st.nextToken());
            map.put(tempInt, map.getOrDefault(tempInt, 0)+1);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++){
            int searchNum = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(searchNum, 0) + " ");
        }

        System.out.println(sb.toString());
    }
}
