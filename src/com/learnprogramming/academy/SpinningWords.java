package com.learnprogramming.academy;

public class SpinningWords {
    /*
    Write a function that takes in a string of one or more words,
    and returns the same string, but with all five or more letter
    words reversed (Just like the name of this Kata).
    
    Strings passed in will consist of only letters and spaces.
    Spaces will be included only when more than one word is present.
    
    Examples:
        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
        spinWords( "This is a test") => returns "This is a test"
        spinWords( "This is another test" )=> returns "This is rehtona test"
     */
    
    public static String spinWords (String string){
        StringBuilder result = new StringBuilder();
    
        // separate string by spaces into string array
        String[] words = string.split("\\s");
        
        // reverse elements that are 5+ char long
        for (String s: words) {
            StringBuilder reversedWord = new StringBuilder(s);
            if(s.length() > 4){
                s = reversedWord.reverse().toString();
            }
            result.append(reversedWord + " ");
        };
        
        // trim off extra space
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        System.out.println(spinWords("Here is another test."));
    }
    
}

/*
    Solution using streams:
    public class SpinWords {

        public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
        }
    }
 */
