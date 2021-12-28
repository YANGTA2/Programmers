package com.BAEKJOON.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON2869 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int result = (v - b)/(a - b);
        if((v - b)%(a - b) != 0){
            result++;
        }

        System.out.println(result);
    }

    /*  --! 시간초과
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int now = 0, cnt = 0;

        while(true){
            now += a;
            if(now > v){
                break;
            } else {
                now -= b;
            }
            cnt++;
        }

        sc.close();
        return cnt;
    }
    */
}
