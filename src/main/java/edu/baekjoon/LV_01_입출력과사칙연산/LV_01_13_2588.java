package edu.baekjoon.LV_01_입출력과사칙연산;

import java.util.Scanner;

public class LV_01_13_2588 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(B % 10 * A);
		System.out.println(B / 10 % 10 * A);
		System.out.println(B / 100 % 10 * A);
		System.out.println(A * B);
		sc.close();
    }
}
