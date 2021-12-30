package com.BAEKJOON.BasicMath1;

import java.math.BigInteger;
import java.util.Scanner;

public class BAEKJOON10757 {
    
    public static void main(String[] args) {
        
        BAEKJOON10757 sol = new BAEKJOON10757();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
    }
}
