package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    private static final Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user
        System.out.println("Type the game score:\n[team1:team2|score1:score2]");
        String rawInput = getInput.nextLine();

        //format input
        String[] teamsScores = rawInput.split("\\|");
        String[] teams = teamsScores[0].split(":");
        String[] scores = teamsScores[1].split(":");

        //determine winner and print output message
        //i got lazy with this one ok don't judge
        if ( Integer.parseInt(scores[0]) < Integer.parseInt(scores[1]) ) {
            System.out.printf("Team \"%s\" has won with a score of %s", teams[1], scores[1]);
        } else if ( Integer.parseInt(scores[0]) == Integer.parseInt(scores[1]) ) {
            System.out.println();
        }


    }
}
