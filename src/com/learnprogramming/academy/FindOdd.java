package com.learnprogramming.academy;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Boolean> oddOccurences = new HashMap();
        for(int i = 0; i < a.length; i++){
            Integer number = Integer.valueOf(a[i]);
            toggleMapValue(oddOccurences, number);
        }
        return oddOccurences.;
    }
    
    private static void toggleMapValue(Map<Integer, Boolean> map, Integer number) {
        if(map.containsKey(number)){
            map.replace(number, !map.get(number));
        } else{
            map.put(number, Boolean.TRUE);
        }
    }
}
