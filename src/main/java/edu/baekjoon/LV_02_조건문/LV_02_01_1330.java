package edu.baekjoon.LV_02_조건문;

import java.util.Scanner;

public class LV_02_01_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>B) {
				System.out.println(">");
			} else if(A<B) {
				System.out.println("<");
			} else if(A==B) {
				System.out.println("==");
			}
		}
        sc.close();
    }
}
