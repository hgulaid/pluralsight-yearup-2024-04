package com.pluralsight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // prompt user for teams and scores
    Scanner userInput = new Scanner(System.in);
    System.out.print("What teams played and what was the final score?\n");
    System.out.println("format must be Home:Visitor|23:9");

    String results = userInput.nextLine();
    String[] parts = results.split("[:|]");
        String team1 = parts[0];
        String team2 = parts[1];
        int team1Score = Integer.parseInt(parts[2]);
        int team2Score = Integer.parseInt(parts[3]);
        String winningTeam;
        if (team1Score > team2Score){
            winningTeam = team1;
            System.out.printf("Winners: %s", winningTeam);
        } else{
            winningTeam = team2;
            System.out.printf("Winners: %s", winningTeam);

        }
        }




}






