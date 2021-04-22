package com.learnprogramming.academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static void main(String[] args) {
        int[] array = {23,21,23};
        System.out.println(findIt(array));
    }
    
    public static int findIt(int[] a) {
        ArrayList<Integer> oddOccurences = new ArrayList();
        for(int i = 0; i < a.length; i++){
            Integer number = Integer.valueOf(a[i]);
            if (oddOccurences.contains(number)){
                oddOccurences.remove(number);
            } else {
                oddOccurences.add(number);
            }
        }
        return oddOccurences.get(0).intValue();
    }
    

}
