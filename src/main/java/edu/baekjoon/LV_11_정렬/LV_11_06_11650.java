package edu.baekjoon.LV_11_정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class LV_11_06_11650 {

    public static void main(String[] args) throws Exception {
        
        LV_11_06_11650 sol = new LV_11_06_11650();
        sol.solution();
        
    }

    public void solution() throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            arr[i][0] = Integer.parseInt(input.split(" ")[0]);
            arr[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                
                if(o1[0] == o2[0]){
                    return Integer.compare(o1[1], o2[1]);
                }

                return Integer.compare(o1[0], o2[0]);
            }
            
        });

        StringBuilder sb = new StringBuilder();

        for(int[] a : arr){
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }

        System.out.println(sb);

        /*
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i][0] > arr[j][0]){
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if(arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]){
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        */
    }
}
