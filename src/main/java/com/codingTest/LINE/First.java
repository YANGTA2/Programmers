package com.codingTest.LINE;

import java.util.Arrays;

class First{
    public static void main(String[] args) {

        // logs : ["team_name : db application_name : dbtest error_level : info message : test", "team_name : test application_name : I DONT CARE error_level : error message : x", "team_name : ThisIsJustForTest application_name : TestAndTestAndTestAndTest error_level : test message : IAlwaysTestingAndIWillTestForever", "team_name : oberervability application_name : LogViewer error_level : error"]
        // logs : ["team_name : MyTeam application_name : YourApp error_level : info messag : IndexOutOfRange", "no such file or directory", "team_name : recommend application_name : recommend error_level : info message : RecommendSucces11", "team_name : recommend application_name : recommend error_level : info message : Success!", "   team_name : db application_name : dbtest error_level : info message : test", "team_name     : db application_name : dbtest error_level : info message : test", "team_name : TeamTest application_name : TestApplication error_level : info message : ThereIsNoError"]
        String test = "team_name : db application_name : dbtest error_level : info message : test";
        System.out.println(solution(test));
    }

    public static boolean solution(String logs) {
        
        System.out.println("log의 길이 : " + logs.length());
        // 로그의 길이는 1 <= 로그 <= 100
        if(logs.length() < 1 || logs.length() > 100){
            return false;
        }

        String[] check = logs.split(" ");
        System.out.println(Arrays.toString(check));
        System.out.println(check.length);
        boolean[] validate = new boolean[4];
        
        if(check.length != 12){
            return false;
        } else {
            validate[0] = check[0].contains("team_name");
            validate[1] = check[3].contains("application_name");
            validate[2] = check[6].contains("error_level");
            validate[3] = check[9].contains("message");
        }

        for(int i = 0; i < validate.length; i++){
            if(validate[i] == false){
                return false;
            }
        }

        // 숫자나 특스문자가 들어있는 지 여부
        for(int i = 2; i < check.length; i=i + 2){
            for(int j = 0; j < check[i].length(); j++){
                if(check[i].charAt(j) < 'a' || check[i].charAt(j) > 'z'){
                    return false;
                }        
            }
        }

        return true;
    }
    
    // ["team_name : db application_name : dbtest error_level : info message : test", "team_name : test application_name : I DONT CARE error_level : error message : x", "team_name : ThisIsJustForTest application_name : TestAndTestAndTestAndTest error_level : test message : IAlwaysTestingAndIWillTestForever", "team_name : oberervability application_name : LogViewer error_level : error"]

}