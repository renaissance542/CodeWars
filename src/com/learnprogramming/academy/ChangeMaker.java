package com.learnprogramming.academy;

import java.util.ArrayList;
import java.util.List;

public class ChangeMaker {
    public static void main(String[] args) {
        Float price = new Float(1.33);
        List<Float> payment = new ArrayList<>();
        payment.add(new Float(1.00));
        payment.add(new Float(1.00));
    
        for (Integer coinCount: ChangeMaker(price, payment)
             ) {
            System.out.println(coinCount);
            
        }
    }
    
    public static List<Integer> ChangeMaker(float price, List<Float> payment) {
        // convert payment values to cents
        int paymentTotalCents = 0;
        for (Float dollar: payment) {
            paymentTotalCents += dollar * 100;
        }
        System.out.println("paymentTotalCents = " + paymentTotalCents);
        // if payment is insufficient, return payment as coins
        // if payment is enough, return difference as coins

        int priceCents = Math.round(price * 100);
        System.out.println("priceCents = " + priceCents);
        int changeCents;
        if (paymentTotalCents >= priceCents){
            changeCents = paymentTotalCents - priceCents;
        } else{
            changeCents = paymentTotalCents;
        }
        

        List<Integer> coinsChange = new ArrayList<>();
        coinsChange.add(0, changeCents/25); //number of quarters
        changeCents %= 25;
        coinsChange.add(0, changeCents/10); //number of dimes
        changeCents %= 10;
        coinsChange.add(0, changeCents/5); //number of nickels
        changeCents %= 5; // number of pennies
        coinsChange.add(0,changeCents);
        return coinsChange;
    }
}
