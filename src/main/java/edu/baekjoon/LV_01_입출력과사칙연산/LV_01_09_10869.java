package edu.baekjoon.LV_01_입출력과사칙연산;

import java.util.Scanner;

public class LV_01_09_10869 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d\n%d", A+B, A-B, A*B, A/B, A%B);
		sc.close();
    }
}
