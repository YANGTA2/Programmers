package edu.baekjoon.LV_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LV_03_05_2741 {

    public static void main(String[] args) throws IOException {
        
        LV_03_05_2741 sol = new LV_03_05_2741();
        sol.solution();
        
    }

    private void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
            
        for(int i = t; i > 0; i--){              
            bw.write((i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}