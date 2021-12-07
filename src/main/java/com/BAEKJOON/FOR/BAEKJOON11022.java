package com.BAEKJOON.FOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BAEKJOON11022 {
    public static void main(String[] args) throws IOException {   
        BAEKJOON11022 sol = new BAEKJOON11022();
        sol.solution();
    }

    private void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int cnt = t;
            
        for(int i = 0; i < t; i++){
            for(int a = cnt; a > 1; a--){
                bw.write(" ");
            }
            for(int y = 0; y < i+1; y++){
                bw.write("*");
            }
            bw.write("\n");
            cnt--;
        }
        bw.flush();
        bw.close();
    }
}
