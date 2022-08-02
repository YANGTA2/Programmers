package edu.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Test{
    public static void main(String[] args) {
        String[] orders = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
        
        Test sol = new Test();
    
        System.out.println(sol.solution(orders));
    }

    public String[] solution(String[] orders) {

        HashMap<String, HashSet<String>> idList = new HashMap<>();
        HashSet<String> orderList = new HashSet<>();
        
        for(int i = 0; i < orders.length; i++){
            String[] orderDetail = orders[i].split(" ");
            String userId = "";

            for(int j = 0; j < orderDetail.length; j++){ 
                if( j == 0){
                    userId = orderDetail[j];
                } else {
                    orderList = idList.getOrDefault(userId, new HashSet<>());
                    String food = orderDetail[j];
                    orderList.add(food);
                    idList.put(userId, orderList);
                }              
            }
        }

        HashMap<String, Integer> result = new HashMap<>();
        int maxLength = 0;

        for(String user : idList.keySet()){
            int orderLength = idList.get(user).size();
            result.put(user, orderLength);
            if(orderLength > maxLength){
                maxLength = orderLength;
            }
        }

        String prevAnswer = "";

        for(String user : result.keySet()){
            if(maxLength == result.get(user)){
                prevAnswer += user + " ";
            }
        }

        String[] answer = prevAnswer.split(" ");

        Arrays.sort(answer);

        return answer;
    }
    
}