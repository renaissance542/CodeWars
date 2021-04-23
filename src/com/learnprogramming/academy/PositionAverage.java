package com.learnprogramming.academy;

public class PositionAverage {
    public static void main(String[] args) {
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"));
    }
    
    public static double posAverage(String s) {
        String[] strings = s.split(", ");
        int matchedPositions = 0;
        for(int i = 0; i < strings.length-1; i++){
            for(int k = i+1; k < strings.length; k++){
                matchedPositions += numberOfMatchingPositions(strings[i], strings[k]);
            }
        }
    
        double stringsCompared = (strings.length * (strings.length-1)
                ) / 2.00;
        double positionsCompared = stringsCompared * strings[0].length();
        double percentMatchedPositions = 100 * matchedPositions / positionsCompared;
        return percentMatchedPositions;
    }
    
    public static int numberOfMatchingPositions(String a, String b){
        int matchedPositions = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                matchedPositions++;
            }
        }
        return matchedPositions;
    }

}
