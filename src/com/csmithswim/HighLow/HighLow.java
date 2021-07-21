package com.csmithswim.HighLow;

import com.csmithswim.company.Die;

import java.util.Scanner;

public class HighLow {

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();
        //While loop to set game in motion, break out of it if you guessed correctly.
            while(true){
            die1.roll();
            die2.roll();
            int total = die1.value + die2.value;
            System.out.println(die1.value + " + " + die2.value + " = " + (total) );
            System.out.println("Will the next number be (h)igher or (l)ower?");
            String input = scanner.next();            die1.roll();
            die2.roll();
            int newTotal = die1.value + die2.value;
            if (total == newTotal) {
                System.out.println("same number you lose");
            }            boolean isLarger = newTotal > total;
            System.out.println(die1.value + " + " + die2.value + " = " + (newTotal) );
            System.out.println(isLarger ? "Number is higher" : "Number is lower");
            boolean didWin = false;
            if (input.equals("h")) { //guessed higher
                if (isLarger) {
                    didWin = true;
                }
            } else { //guessed lower
                if (!isLarger) {
                    didWin = true;
                }
            }
            System.out.println(didWin ? "you WIN" : "You LOSE");
            if(!didWin) {
                break;
            }
        }
    }
}
