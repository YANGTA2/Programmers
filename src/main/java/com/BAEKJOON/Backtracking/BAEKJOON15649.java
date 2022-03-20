package com.BAEKJOON.Backtracking;

import java.util.Scanner;

public class BAEKJOON15649 {
    
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        sc.close();
        
        arr = new int[m];
        visit = new boolean[n];
        
        BAEKJOON15649 sol = new BAEKJOON15649();
        sol.solution(n, m, 0);
        
    }
    
    public void solution(int n, int m, int depth){
        if(depth == m){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visit[i]){
                visit[i] = true;    // visit[0] (즉, 1)에 체크 (중복 수 출력 방지)
                arr[depth] = i + 1; // arr[0]에 1을 담는다.

                solution(n, m, depth + 1);
                /* --! 재귀 호출 시,
                for(int i = 0; i < n; i++){
                    if(!visit[i]){                  // 0번째는 실행 X -> 1 미출력
                        visit[i] = true;            // 1번째가 true 로 변경되고 재귀호출
                        arr[depth] = i + 1;         // arr[1] 2를 담는다. ...  arr = [1, 2]
                        solution(n, m, depth + 1);  // depth2 이므로 Syso
                        visit[i] = false;           // 다음 노드를 위해 false로 초기화
                    }
                }
                */
                visit[i] = false;
            }
        }
    }
}
