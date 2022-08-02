package edu.baekjoon.LV_12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LV_12_05_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N + M; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0)+1);
        }

        int cnt = 0;
        ArrayList<String> nameList = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key) == 2){
                nameList.add(key);
                cnt++;
            }
        }

        Collections.sort(nameList);
        for(String name : nameList){
            sb.append(name + "\n");
        }

        System.out.println(cnt);
        System.out.println(sb.toString());
    }
}
