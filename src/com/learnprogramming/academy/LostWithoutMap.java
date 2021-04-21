package com.learnprogramming.academy;

import java.util.Arrays;

public class LostWithoutMap {
    
    public static void main(String[] args) {
        for (int i: map(new int[]{1, 2, 3, 4})){
            System.out.println(i);
        }
        
    }
    public static int[] map(int[] arr){
        int[] result =
        Arrays.stream(arr)
//                .sequential()
                .map(i -> i*2)
                .toArray();
        return result;
                
    }
}
