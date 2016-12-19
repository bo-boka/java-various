/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import com.tsguild.consoleio.IOUserPrompt;

/**
 *
 * @author apprentice
 */
public class RPSGuts {
    
    public static String validateString(String prompt){
        String input = IOUserPrompt.stringOut(prompt);
        while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")){
                System.out.println("Invalid Entry");
                input = IOUserPrompt.stringOut(prompt);
            } 
        return input;     
    }
    
    public static int chooseRPS(String input){
        int userChoice = 0;
        if (input.equals("rock")) {
                userChoice = 0;
            } else if (input.equals("paper")) {
                userChoice = 1;
            } else if (input.equals("scissors")) {
                userChoice = 2;
            }
        return userChoice;
    }
    
    public static String playGame(int userChoice, int botChoice){
        if (userChoice == botChoice) {
            System.out.println("Tie!");
            return "tie";
        } else if (botChoice == 0) {
            if (userChoice == 1) {
                System.out.println("You win");
                return "youWin";
            } else {
                System.out.println("Bot wins");
                return "botWins";
            }
        } else if (botChoice == 1) {
            if (userChoice == 0) {
                System.out.println("Bot wins");
                return "botWins";
            } else {
                System.out.println("You win");
                return "youWin";
            }
        } else {
            if (userChoice == 0) {
                System.out.println("You win");
                return "youWin";
            } else {
                System.out.println("Bot wins");
                return "botWins";
            }
        }
    }
    
    public static void printResults(int tie, int youWin, int botWins){
        System.out.println("Number of ties: " + tie);
        System.out.println("You won " + youWin + " times");
        System.out.println("The bot won " + botWins + " times");
        if (botWins > youWin) {
            System.out.println("Overall, the bot won.");
        } else if (botWins < youWin) {
            System.out.println("Overall, you won.");
        } else {
            System.out.println("It's a tie.");
        }
    }
}
