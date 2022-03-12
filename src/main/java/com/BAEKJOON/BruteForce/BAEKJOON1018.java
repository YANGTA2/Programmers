package com.BAEKJOON.BruteForce;

import java.util.Scanner;

public class BAEKJOON1018 {

    public static void main(String[] args) {
        
        BAEKJOON1018 sol = new BAEKJOON1018();
        System.out.println(sol.solution());
        
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        char[][] input = new char[row][col];
        for(int i = 0; i < row; i++){
            String inputStr = sc.nextLine();
            for(int j = 0; j < inputStr.length(); j++){
                input[i][j] = inputStr.charAt(j);
            }
        }
        
        sc.close();

        int minCnt = row * col;

        // 8x8이 가능한 이동 범위를 옮기며 모두 탐색
        for(int i = 0; i <= row - 8; i++){
            for(int j = 0; j <= col - 8; j++){
                
                int cnt = 0;
                // row좌표 + col좌표 합이 홀수 = B
                //                        짝수 = W
                for(int k = 0; k < 8; k++){
                    for(int l = 0; l < 8; l++){
                        if((k+l) % 2 == 0 && input[k+i][l+j] == 'B'){
                            cnt++;
                        } else if((k+l) % 2 != 0 && input[k+i][l+j] == 'W'){
                            cnt++;
                        }
                    }
                }
                cnt = Math.min(cnt, 64-cnt);
                minCnt = minCnt > cnt ? cnt : minCnt;
            }
        }

        return minCnt;
    }
}
