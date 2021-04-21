package com.learnprogramming.academy;

public class OverRoad {
    public static void main(String[] args) {
    
        System.out.println(overTheRoad(3L, 5L));
    }
    
    public static long overTheRoad(long address, long n){
        if (n%2==0){
            return 1 + 2*n - address;
        } else {
            return 2*n - address +1; // rofl that's the same as above.  woops can make it one return statement
        }
    }
}
