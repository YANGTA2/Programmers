package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_12_2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        int cntTwo = findTwo(A) - findTwo(B) - findTwo(A-B);
        int cntFive = findFive(A) - findFive(B) - findFive(A-B);

        System.out.println(Math.min(cntTwo, cntFive));        
        sc.close();
    }

    public static int findTwo(int in){
        int cnt = 0;
        while(in >= 2){
            in /= 2;
            cnt += in;
        }
        return cnt;
    }

    public static int findFive(int in){
        int cnt = 0;
        while(in >= 5){
            in /= 5;
            cnt += in;
        }
        return cnt;
    }
}
