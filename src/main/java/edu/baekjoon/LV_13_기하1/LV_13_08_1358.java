package edu.baekjoon.LV_13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LV_13_08_1358 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int playerCnt = 0;
        for(int i = 0; i < P; i++){
            st = new StringTokenizer(br.readLine());
            int playerX = Integer.parseInt(st.nextToken());
            int playerY = Integer.parseInt(st.nextToken());

            if(X <= playerX && playerX <= X+W && Y <= playerY && playerY <= Y+H){
                playerCnt++;
            } else {
                int coordY = Y + H/2;
                if(Math.pow(playerX-X, 2) + Math.pow(playerY-coordY, 2) <= Math.pow(H/2, 2)){
                    playerCnt++;
                } else if(Math.pow(playerX-(X+W), 2) + Math.pow(playerY-coordY, 2) <= Math.pow(H/2, 2)){
                    playerCnt++;
                }
            }
        }
        System.out.println(playerCnt);
    }
}
