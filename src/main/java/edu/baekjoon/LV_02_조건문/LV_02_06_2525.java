package edu.baekjoon.LV_02_조건문;

import java.util.Scanner;

public class LV_02_06_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int time = sc.nextInt();

			if(m + time >= 60){
				h = h + ( m + time ) / 60;
				m = ( m + time ) % 60;
			} else {
				m = m + time;
			}

			if( h >= 24){
				h -= 24;
			}
			
			System.out.println(h + " " + m);
		}
        sc.close();
    }
}
