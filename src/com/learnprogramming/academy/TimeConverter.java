package com.learnprogramming.academy;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(toTime(3500));
    }
    public static String toTime(int seconds){
        int totalMinutes = seconds / 60; // extra seconds discarded
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        return "" + hours + " hour(s) and " +
                remainingMinutes + " minute(s)";
        
    }
}
