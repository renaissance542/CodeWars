package com.learnprogramming.academy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
    
        long time = System.currentTimeMillis();
        for(int i=1; i<1000;i++){
            System.out.println("Hamming " + i + " = " + Hamming.hamming(i));
        }
//        System.out.println("Hamming 1500 = " + Hamming.hamming(1500));
        System.out.println("Total time in Millis = " + (System.currentTimeMillis()-time));

    }
}
