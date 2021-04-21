package com.learnprogramming.academy;

/*
Let us take a string composed of decimal digits: "10111213".
We want to code this string as a string of 0 and 1 and after that be able to decode it.
To code we decompose the given string in its decimal digits
    (in the above example: 1 0 1 1 1 2 1 3) and we will code each digit.
Coding process to code a number n expressed in base 10:
    For each digit d of n
    a) Let k be the number of bits of d
    b) Write k-1 times the digit 0 followed by the digit 1
    c) Write digit d as a binary string, with the rightmost bit being the least significant
    d) Concat the result of b) and c) to get the coding of d

At last concatenate all the results got for the digits of n.
An example
    So we code 0 as 10, 1 as 11, 2 as 0110, 3 as 0111 ... etc...
    With the given process, the initial string "10111213" becomes: "11101111110110110111"
    resulting of concatenation of 11 10 11 11 11 0110 11 0111.
Task:
    Given strng a string of digits representing a decimal number
    the function code(strng) should return the coding of strng as explained above.

    Given a string strng resulting from the previous coding,
    decode it to get the corresponding decimal string.

Examples:
code("77338855") --> "001111001111011101110001100000011000001101001101"
code("77338")  --> "0011110011110111011100011000"
code("0011121314") --> "1010111111011011011111001100"

decode("001111001111011101110001100000011000001101001101") -> "77338855"
decode("0011110011110111011100011000") -> "77338"
decode("1010111111011011011111001100") -> "0011121314"

 */

public class CodeDecode {
    
    // Number / Binary / Code
    // 1  -> 1    ->  11   n=0 substring (1,2)  (n+1, 2n+2)
    // 2  -> 10   -> 0110
    // 3  -> 11   -> 0111  n=1 substring (2,4) (n+1, 2n+2)  //if (2n+2 >= str.length)
    // 4  -> 100  -> 001100
    // 5  -> 101  -> 001101
    // 6  -> 110  -> 001110
    // 7  -> 111  -> 001111   n=2.  substring(3) if end of string.  else substring (3,6)  (n+1, 2n+2)
    // 8  -> 1000 -> 00011000
    // 9  -> 1001 -> 00011001
    
    // int foo = Integer.parseInt("1001", 2);
    // String bin = Integer.toBinaryString(dec);
    
    public static void main(String[] args) {
        System.out.println("code(77338) =  " + code("77338"));
        System.out.println("decode (\"0011110011110111011100011000\") = " +
                decode("0011110011110111011100011000"));

    }
    
    public static String code(String strng) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < strng.length(); i++){
            code.append(encodeDigit(Integer.parseInt(String.valueOf(strng.charAt(i)))));
        }
        return code.toString();
    }
    
    public static String encodeDigit(int n){
        StringBuilder code = new StringBuilder(Integer.toBinaryString(n));
        int zeros = code.length()-1;
        code.insert(0,'1');
        while(zeros > 0){
            code.insert(0, '0');
            zeros--;
        }
        return code.toString();
    }
    public static String decode(String str) {
        StringBuilder result = new StringBuilder();
        String binaryNumber ="";
        String remainderString = str;
        
        while (remainderString.length()>0){
            // parse to the first 1, counting the digits
            int nextOne = remainderString.indexOf('1');
            // take the next group of characters equal to the counter
            if (nextOne*2+2 >= remainderString.length()){
                binaryNumber = remainderString.substring(nextOne+1);
                remainderString = "";
            } else {
                binaryNumber = remainderString.substring(nextOne+1, (nextOne*2 + 2));
                remainderString = remainderString.substring(nextOne*2 + 2);
            }
            // convert from binary to int
            int numberToAdd = Integer.parseInt(binaryNumber, 2);
    
            // append int to new string
            result.append(numberToAdd);
        }
        return result.toString();
    }
}















