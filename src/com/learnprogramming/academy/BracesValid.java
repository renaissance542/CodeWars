package com.learnprogramming.academy;

import java.util.ArrayList;

public class BracesValid {
    public static void main(String[] args) {
        System.out.println(containsValidBraces("([{}]])"));
    
    }
    
    public static String containsValidBraces(String testString) {
        // Write your code here
        // build a string of just the brackets
        // opening brackets are appended to a stringbuilder
        // each closing bracket is checked against the last opening bracket
        // if it matches, delete them both
        // if it doesn't match, return "invalid"
        // at the end if the stringbuilder length = 0 then return "valid"
        // if the stringbuilder.length > 0 return "invalid"
        
        StringBuilder parsedBrackets = new StringBuilder();
        Boolean valid = true;
    
        ArrayList<Character> openBrackets = new ArrayList();
        openBrackets.add('(');
        openBrackets.add('[');
        openBrackets.add('{');
        
        ArrayList<Character> closeBrackets = new ArrayList<>();
        closeBrackets.add(')');
        closeBrackets.add(']');
        closeBrackets.add('}');
        
        for (int i = 0; i < testString.length(); i++){
            if(openBrackets.contains(testString.charAt(i))){
                parsedBrackets.append(testString.charAt(i));  // append open brackets
            } else if(closeBrackets.contains(testString.charAt(i))){
                valid = deleteBracketPair(parsedBrackets, testString.charAt(i));
                if(!valid) {
                    System.out.println("invalid");
                    return "invalid";
                }
            }
        }
        
        // if all brackets are closed and deleted the string is valid
        if (parsedBrackets.length() == 0 || valid) {
            System.out.println("valid");
            return "valid";
        } else{
            System.out.println("invalid");  // open brackets remain
            return "invalid";
        }
        
        
    }
    
    public static boolean deleteBracketPair(StringBuilder parsedBrackets, char closeBracket){
        if ((parsedBrackets.charAt(parsedBrackets.length()-1) ==  '{' && closeBracket == '}')
                || (parsedBrackets.charAt(parsedBrackets.length()-1) ==  '(' && closeBracket == ')')
                || (parsedBrackets.charAt(parsedBrackets.length()-1) ==  '[' && closeBracket == ']')
        ){
            parsedBrackets.deleteCharAt(parsedBrackets.length()-1);
            return true;
        }
        return false;
    }
    
}
