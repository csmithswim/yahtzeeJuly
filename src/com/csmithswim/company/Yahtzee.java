package com.csmithswim.company;

import java.util.Scanner;

public class Yahtzee {
    //    public Cup myCup = new Cup();
    public Player player;
    private final Scanner scanner = new Scanner(System.in);

    public Yahtzee() {
        System.out.println("What is your name?");
        player = new Player((scanner.nextLine()).trim());
    }

    // [X]TODO refactor play to run 5 turns then display total score.

    public void play() {
        for (int i = 0; i <= 4; i++) {
            turn();
        }
    }

    public void getSelections() {
        System.out.println("select dice you want to re-roll (1-5)");
        String input = scanner.nextLine(); // "1 2 5"
        player.cup.roll(player.cup.parseSelections(input));
    }

    //[X] TODO refactor turn to update score and display round score *(and total score)
    public void turn() {
        player.cup.roll();
        System.out.println("Player's total score: " + player.score);
        System.out.println(player.cup.displayCup());
        getSelections();
        System.out.println("Player's round score: " + player.updateScore());


    }

}