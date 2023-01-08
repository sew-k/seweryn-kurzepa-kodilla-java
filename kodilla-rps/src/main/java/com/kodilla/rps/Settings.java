package com.kodilla.rps;

public class Settings {
    private static boolean onePlayerGame = true;
    private static int numberOfRounds = 4;

    public boolean isOnePlayerGame() {
        return onePlayerGame;
    }

    public void setOnePlayerGame(boolean onePlayerGame) {
        this.onePlayerGame = onePlayerGame;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public void showGameSettings() {
        System.out.println("Current game settings:");
        System.out.println("- One player game - [" + isOnePlayerGame() + "]");
        System.out.println("- Two player game - [" + !isOnePlayerGame() + "]");
        System.out.println("- number of rounds: " + getNumberOfRounds());
    }
}
