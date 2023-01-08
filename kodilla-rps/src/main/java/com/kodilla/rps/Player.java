package com.kodilla.rps;

public class Player {

    public String playerName;
    public String choice;
    public int gameScore;

    public void setChoice() {
        this.choice = "aaaa";
//        HumanPlayer humanPlayer = new HumanPlayer();
//        GameProcessor gameProcessor = new GameProcessor();
//        System.out.print(getPlayerName() + " - please select your choice: ");
//        this.choice = gameProcessor.getChoices().get(humanPlayer.selectIntFromKeyboard());
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getChoice() {
        return choice;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public int getGameScore() {
        return gameScore;
    }
}
