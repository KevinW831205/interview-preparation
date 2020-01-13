package com.github.curriculeon.assessment1.part1;

import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if(handSign.equals(ROCK)){
            return PAPER;
        } else if (handSign.equals(PAPER)){
            return SCISSOR;
        } else if( handSign.equals(SCISSOR)){
            return ROCK;
        }
        return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if(handSign.equals(ROCK)){
            return SCISSOR;
        } else if (handSign.equals(PAPER)){
            return ROCK;
        } else if( handSign.equals(SCISSOR)){
            return PAPER;
        }
        return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        boolean player1win = getWinningMove(handSignOfPlayer2).equals(handSignOfPlayer1);
        if(handSignOfPlayer1.equals(handSignOfPlayer2)){
            return "tie";
        } else if (player1win){
            return handSignOfPlayer1;
        } else {
            return handSignOfPlayer2;
        }
    }
}
