package edu.baekjoon.LV_02_조건문;

import java.util.Scanner;

public class LV_02_03_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int year = sc.nextInt();
			
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
        sc.close();
    }
}
