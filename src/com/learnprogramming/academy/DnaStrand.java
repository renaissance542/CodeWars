package com.learnprogramming.academy;
/*
DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"
 */

public class DnaStrand {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
    
    public static String makeComplement(String dna){
        StringBuilder complimentStrand = new StringBuilder();
        for(int i = 0; i < dna.length(); i++){
            complimentStrand.append(getCompliment(dna.charAt(i)));
        }
        return complimentStrand.toString();
    }
    
    private static char getCompliment(char c){
        switch (c){
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            default:
                return 'X';
        }
    }
}
