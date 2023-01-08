package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {
    private String choice;

    private static final String playerName = "Computer";

    @Override
    public String getPlayerName() {
        return playerName;
    }
    @Override
    public void setChoice() {
        Random random = new Random();
        GameProcessor gameProcessor = new GameProcessor();
        List <String> computerChoices = gameProcessor.getChoices();
        String choice = computerChoices.get(random.nextInt(3));
        this.choice = choice;
    }

    @Override
    public String getChoice() {
        return choice;
    }
}
