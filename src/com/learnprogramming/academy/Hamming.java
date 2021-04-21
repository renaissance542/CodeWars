package com.learnprogramming.academy;

import java.util.ArrayList;
import java.util.List;

/**
 * A Hamming number is a positive integer of the form 2i3j5k, for some non-negative integers i, j, and k.
 *
 * Write a function that computes the nth smallest Hamming number.
 *
 * Specifically:
 *
 * The first smallest Hamming number is 1 = 2^0*3^0*5^0
 * The second smallest Hamming number is 2 = 2^1*3^0*5^0
 * The third smallest Hamming number is 3 = 2^0*3^185^0
 * The fourth smallest Hamming number is 4 = 2^2*3^0*5^0
 * The fifth smallest Hamming number is 5 = 2^0*3^0*5^1
 * The 20 smallest Hamming numbers are given in example test fixture.
 *
 * Your code should be able to compute all of the smallest 5,000 (Clojure: 2000, NASM: 13282) Hamming numbers without timing out.
 */
public class Hamming {
    public static long hamming(int n){
        //loop through i=0;i++
            //divide i by 2 until 2%n != 0
            //divide i by 3 until 2%n != 0
            //divide i by 5 until 2%n != 0
            //if i==1 then it's a hamming number and counter++
            //if counter = n then return the number
        List<Long> hammingList = new ArrayList();
        long testNumber = 1;
        int counter = 0;
        long time;
    
        while (true) {
        
            long workingNumber = testNumber;
        
//            if (workingNumber % 5 !=00 && workingNumber%3 != 0 && workingNumber % 2 != 0) {
//                testNumber++;
//                continue;
//            }
            for (int i = (int)(hammingList.size()*0.4); i < hammingList.size(); i++) {
                while (workingNumber % hammingList.get(i) == 0) {
                    workingNumber /= hammingList.get(i);
                }
            }
        
            while (workingNumber % 5 == 0) {
                workingNumber /= 5;
            }
        
            while (workingNumber % 3 == 0) {
                workingNumber /= 3;
            }
        
            while (workingNumber % 2 == 0) {
                workingNumber /= 2;
            }
        
            if (workingNumber == 1) {
                counter++;
                if (workingNumber > 5) hammingList.add(0, testNumber);
            }
            if (counter == n) {
                return testNumber;
            }
            testNumber++;
        }
    }

}


