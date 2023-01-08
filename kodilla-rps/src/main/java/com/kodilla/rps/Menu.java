package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private final List<String> gameMenu = new ArrayList<>(Arrays.asList("Start Game","Game Settings","Show Scoreboard","Exit"));

    public void showGameTitle() {
        System.out.println("==============================");
        System.out.println("ROCK - PAPER - SCISSORS  ");
    }

    public void showGameMenu() {
        GameProcessor gameProcessor = new GameProcessor();
        System.out.println("------------------------------");
        for (String menuItem : gameMenu) {
            System.out.println("[" + gameMenu.indexOf(menuItem) + "] - " + menuItem);
        }
        System.out.println("------------------------------");
    }

    public void menuSelection() {
        int selection;
        GameProcessor gameProcessor = new GameProcessor();
        ScoreBoard scoreBoard = new ScoreBoard();
        Settings settings = new Settings();
        HumanPlayer player = new HumanPlayer();
        selection = player.selectIntFromKeyboard();

        while (selection != 3) {
            if (selection == 0) {
                System.out.println("start game");
                gameProcessor.game();
                return;
            } else if (selection == 1) {
                System.out.println("Game settings:");
                settings.showGameSettings();
                System.out.print("[0] - change, or [1] - leave current : ");
                selection = player.selectIntFromKeyboard();
                if (selection == 0) {
                    System.out.print("Select ONE [1] or TWO [2] player game: ");
                    boolean set = settings.isOnePlayerGame();
                    selection = player.selectIntFromKeyboard();
                    if (selection == 1) {
                        set = true;
                    } else
                    if (selection == 2) {
                        set = false;
                    }
                    settings.setOnePlayerGame(set);
                    System.out.print("Number of rounds: ");
                    selection = player.selectIntFromKeyboard();
                    settings.setNumberOfRounds(selection);

                    gameProcessor.applicationRunner();

                } else if (selection == 1) {
                    gameProcessor.applicationRunner();
                }
                return;
            } else if (selection == 2) {
                System.out.println("score board");
                scoreBoard.printScoreMap();
                System.out.println("Any key to continue");
                if (player.selectStringFromKeyboard() != null) {
                    gameProcessor.applicationRunner();
                };
                return;
            }
        }
        System.out.println("game exit");
    }

}
