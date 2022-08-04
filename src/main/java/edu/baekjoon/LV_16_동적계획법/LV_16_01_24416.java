package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_01_24416 {

    public static int[] fib = new int[41];
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fib[1] = fib[2] = 1;
        System.out.println(fibonacci(N) + " " + cnt);
        sc.close();
    }

    public static int fibonacci(int a){
        if(fib[a] > 0) return fib[a];
        cnt++;
        return fib[a] = fibonacci(a-1) + fibonacci(a-2);
    }
}
