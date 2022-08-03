package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_01_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A == 0 && B == 0){
                sc.close();
                break;
            } else if(B % A == 0){
                System.out.println("factor");
            } else if(A % B == 0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
