package com.learnprogramming.academy;

import java.time.LocalTime;
import java.util.Arrays;

public class KPrimes {
    
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        long[] test;
        long startTime = System.currentTimeMillis();
        test = countKprimes(3, 0, 800000L);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("That took " + duration + " milliseconds.");
        
    }
    public static long[] countKprimes(int k, long start, long end) {
        int length = (int) (end - start);
        long[] result = new long[length];
        int position = 0;
        for(long i = start; i <= end; i++){
            if(countPrimeFactors(i) == k){
                result[position++] = i;
            }
        }
        long[] resultTrimmed = Arrays.copyOfRange(result, 0, position);
        return resultTrimmed;
    }
    
    public static int countPrimeFactors (long number){
        if(number < 2) {
            return -1;
        }
        int factorCounter = 0;
        while (number % 2 == 0) {
            number /= 2;
            factorCounter++;
        }
        
        for(long i = 3; i <= Math.sqrt(number); i +=2){
            while(number % i == 0){
                number /= i;
                factorCounter++;
            }
        }
        if (number > 1) factorCounter++;
        return factorCounter;
    }
    public static int puzzle(int s) {
        long[] onePrimes = countKprimes(1, 0, s);
        long[] threePrimes = countKprimes(3, 0, s);
        long[] sevenPrimes = countKprimes(7, 0, s);
        int countSolutions = 0;
        
        for(int i = 0; i < sevenPrimes.length; i++){
            for (int j = 0; j < threePrimes.length; j++){
                for(int k = 0; k < onePrimes.length; k++){
                    if((sevenPrimes[i] + threePrimes[j] + onePrimes[k]) == s){
                        countSolutions++;
                    }
                }
            }
        }
        return countSolutions;
    }
}















