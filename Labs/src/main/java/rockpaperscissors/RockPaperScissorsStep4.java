/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import com.tsguild.consoleio.IOUserPrompt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissorsStep4 {

    public static void main(String[] args) {

        Random rand = new Random();
        String playAgain;
        int botWins = 0;
        int youWin = 0;
        int tie = 0;

        do {
            int rounds = IOUserPrompt.checkIntRange(1, 10, "How many rounds would you like to play?");
            for (int i = 0; i < rounds; i++) {
                String input = RPSGuts.validateString("rock, paper, or scissors? ");
                int userChoice = RPSGuts.chooseRPS(input);
                int botChoice = rand.nextInt(3);
                String outcome = RPSGuts.playGame(userChoice, botChoice);
                if (outcome.equals("tie")) {
                    tie++;
                } else if (outcome.equals("youWin")) {
                    youWin++;
                } else if (outcome.equals("botWins")) {
                    botWins++;
                }
            }
            RPSGuts.printResults(tie, youWin, botWins);
            botWins = youWin = tie = 0;
            playAgain = IOUserPrompt.stringOut("\nWould you like to play again?");
        } while (playAgain.equalsIgnoreCase("Yes"));
    }

}
