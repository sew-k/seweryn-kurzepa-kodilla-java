package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private String choice;
    @Override
    public void setChoice() {
        GameProcessor gameProcessor = new GameProcessor();
        System.out.print(getPlayerName() + " - please select your choice: ");
        List<String> humanChoices = gameProcessor.getChoices();
        String choice = humanChoices.get(selectIntFromKeyboard()-1);
        this.choice = choice;
    }
    public int selectIntFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        int key = -1;
        try {
            key = scanner.nextInt();
        } catch (RuntimeException r) {
            System.out.println("ERROR: " + r);
            System.out.println("try again");
        }
        return key;
    }

    @Override
    public String getChoice() {
        return choice;
    }

    public String selectStringFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        String keys = null;
        try {
            keys = scanner.next();
        } catch (RuntimeException r) {
            System.out.println("ERROR: " + r);
            System.out.println("try again");
        }
        return keys;
    }
}
