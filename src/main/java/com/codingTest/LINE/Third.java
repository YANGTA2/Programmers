package com.codingTest.LINE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Third{

    public static void main(String[] args) {

        int num_teams = 3;
        String[] remote_tasks = {"development", "marketing", "hometask"};
        String[] office_tasks = {"recruitment", "education", "officetask"};
        String[] employees = {"1 development hometask",
                                "1 recruitment marketing",
                                "2 hometask",
                                "2 development marketing hometask",
                                "3 marketing",
                                "3 officetask",
                                "3 development"};
                              
        HashMap<String, String> empList = new HashMap<>();
        HashSet<Integer> team = new HashSet<>();

        for(int i = 0; i < office_tasks.length; i++){
            for(int j = 0; j < employees.length; j++){
                if(employees[j].contains(office_tasks[i])){
                    team.add(Integer.parseInt(employees[j].split(" ")[0]));
                    employees[j] = "";
                }
            }
        }
        for(int i = 0; i < employees.length; i++){
            if(!employees[i].equals("")){
                String empNum = String.valueOf(i);
                String teamNum = employees[i].split(" ")[0];
                empList.put(empNum, teamNum);
            }
        }
        
        System.out.println(empList);

        for(int i = 1; i < num_teams + 1; i++){
            if(!team.contains(i)){
                System.out.println("추가 필요 팀 : " + i);
                for(String number : empList.keySet()){
                    if(empList.get(number).equals(String.valueOf(i))){
                        empList.remove(number);
                        team.add(i);
                        break;
                    } else {

                    }
                }
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        int[] answer = new int[empList.size()];
        
        for(String num : empList.keySet()){
            ans.add(num);
        }
        
        for(int i = 0; i < ans.size(); i++){
            answer[i] = Integer.parseInt(ans.get(i));
        }

    }
}    