package com.BAEKJOON.FOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BAEKJOON10871 {

    public static void main(String[] args) throws IOException {   
        BAEKJOON10871 sol = new BAEKJOON10871();
        sol.solution();
    }

    private void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer arr = new StringTokenizer(br.readLine());
        while(arr.hasMoreTokens()){
            int num = Integer.parseInt(arr.nextToken());
            if(num < x){
                bw.write(num + " ");        
            }
        }
        bw.flush();
        bw.close();
    }
}