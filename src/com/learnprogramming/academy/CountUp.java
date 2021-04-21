package com.learnprogramming.academy;

public class CountUp {
    public static void main(String[] args) {
        countUp(30);
    }
    
    static void countUp(int start){
        StringBuilder output = new StringBuilder();
        output.append(start+1);
        for(int i = start+2; i<=start+10; i++){
            output.append(" then " + i);
        }
        System.out.println(output.toString());
    }
}
