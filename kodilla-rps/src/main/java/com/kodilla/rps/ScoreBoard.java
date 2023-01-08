package com.kodilla.rps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreBoard {

    private static Map<String, Integer> scoreMap = new HashMap<>(Map.of("Aaa",1, "Bbb",2, "Ccc", 3));

    public void printScoreMap() {
        System.out.println("------------------------------");
        System.out.println("SCORE BOARD");
        System.out.println("Player name ...... Score");
        for (Map.Entry<String, Integer> playerScore : scoreMap.entrySet()) {
            System.out.println(" - " + playerScore.getKey() + "       " + playerScore.getValue());
        }
        System.out.println("------------------------------");
    }

    public void setNewScore(Player player, Integer win) {
        if (scoreMap.containsKey(player.getPlayerName())) {
            scoreMap.put(player.getPlayerName(), scoreMap.get(player.getPlayerName()) + win);
        } else {
            scoreMap.put(player.getPlayerName(), win);
        }
    }


}
