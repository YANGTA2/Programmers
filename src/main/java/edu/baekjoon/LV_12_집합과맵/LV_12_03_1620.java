package edu.baekjoon.LV_12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LV_12_03_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> pokemon = new HashMap<>();
        for(int i = 0; i < N; i++){
            String name = br.readLine();
            String number = String.valueOf(i+1);
            pokemon.put(name, number);
            pokemon.put(number, name);
        }

        for(int i = 0; i < M; i++){
            String in = br.readLine();
            sb.append(pokemon.get(in) + "\n");
        }

        System.out.println(sb.toString());
    }
}
