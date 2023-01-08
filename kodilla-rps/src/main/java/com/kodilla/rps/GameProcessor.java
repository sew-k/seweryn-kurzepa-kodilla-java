package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameProcessor {

    private final List<String> choices = new ArrayList<>(Arrays.asList("rock","paper","scissors"));

    private static int round = 1;

    public List<String> getChoices() {
        return choices;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public void applicationRunner() {
        Menu menu = new Menu();
        menu.showGameTitle();
        menu.showGameMenu();
        try {
            menu.menuSelection();
        } catch (Exception e) {
            System.out.println("ERROR in R-P-S runner: " + e);
        }
//        } finally {
//            System.out.println("End game in applicationRunner");
//        }
    }

    public void game() {
        Settings settings = new Settings();
        ScoreBoard scoreBoard = new ScoreBoard();
        Player playerOne = new Player();
        Player playerTwo = new Player();
        playerOne.setGameScore(0);
        playerTwo.setGameScore(0);

        round = 1;

        if (settings.isOnePlayerGame()) {
            HumanPlayer humanPlayer = new HumanPlayer();
            System.out.print("player name: ");
            humanPlayer.setPlayerName(humanPlayer.selectStringFromKeyboard());
            ComputerPlayer computerPlayer = new ComputerPlayer();
            playerOne = humanPlayer;
            playerTwo = computerPlayer;
        }

        if (!settings.isOnePlayerGame()) {
            HumanPlayer humanPlayerOne = new HumanPlayer();
            System.out.print("player one name: ");
            humanPlayerOne.setPlayerName(humanPlayerOne.selectStringFromKeyboard());
            playerOne = humanPlayerOne;
            HumanPlayer humanPlayerTwo = new HumanPlayer();
            System.out.print("player two name: ");
            humanPlayerTwo.setPlayerName(humanPlayerTwo.selectStringFromKeyboard());
            playerTwo = humanPlayerTwo;
        }

        boolean end = false;
        while (!end) {
            singleRoundProcessor(playerOne, playerTwo);
            //applicationRunner();
            if (round == settings.getNumberOfRounds()) {
                end = true;
            }
            round++;
        }
        scoreBoard.setNewScore(playerOne, playerOne.gameScore);
        scoreBoard.setNewScore(playerTwo, playerTwo.gameScore);

        applicationRunner();
    }

    public void singleRoundProcessor(Player playerOne, Player playerTwo) {

        String result = theDuel(playerOne, playerTwo);
        if (result == "wins") {
                //scoreBoard.setNewScore(playerOne,1);
                playerOne.setGameScore(playerOne.gameScore+1);
        }
        if (result == "loses") {
                //scoreBoard.setNewScore(playerTwo,1);
                playerTwo.setGameScore(playerTwo.gameScore+1);
        }
        System.out.println("player: " + playerOne.getPlayerName() +
                    " [" + playerOne.getChoice() + "] - " + result + " with " +
                    playerTwo.getPlayerName() + " [" + playerTwo.getChoice() + "]");
        System.out.println("current score: " + playerOne.getGameScore() + " : " + playerTwo.getGameScore());
    }

    public String theDuel(Player playerOne, Player playerTwo) {
        String result;
        System.out.println("");
        System.out.println("The duel begins! Round: " + round);
        for (String choice : choices) {
            System.out.println("[" + (choices.indexOf(choice)+1) + "] - " + choice);
        }
        playerOne.setChoice();
        playerTwo.setChoice();
        if ((playerOne.getChoice().equals((playerTwo.getChoice())))) {
            result = "draw";
        } else
        if ((((playerOne.getChoice()).equals("paper")) && ((playerTwo.getChoice()).equals("rock"))) ||
                (((playerOne.getChoice()).equals("rock")) && ((playerTwo.getChoice()).equals("scissors"))) ||
                (((playerOne.getChoice()).equals("scissors")) && ((playerTwo.getChoice()).equals("paper")))) {
            result = "wins";
        } else {
            result = "loses";
        }
        return result;
    }
}
