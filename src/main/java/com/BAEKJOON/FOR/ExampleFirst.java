package com.BAEKJOON.FOR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleFirst {

    public static void main(String[] args) throws IOException {   
        ExampleFirst sol = new ExampleFirst();
        sol.solution();
    }
    
    // 정삼각형 별찍기

    private void solution() throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        String star = "";
        String blank = "";

        for(int i = 1; i < t+1; i++){
            for(int y = 1; y <= i*2-1; y++){
                star += "*";
            }
            for(int a = 1; a < (t-(i*2-1)/2); a++){
                blank += " ";
            }

            System.out.print(blank);
            System.out.print(star);
            star = "";
            System.out.print(blank);
            blank = "";
            System.out.println();
        }
        sc.close();
    }
}