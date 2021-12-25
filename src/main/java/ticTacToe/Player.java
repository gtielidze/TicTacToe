/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author gio
 */
public class Player {

    private String symbol;
    private boolean winner;

    public Player(String symbol) {
        this.symbol = symbol;
        this.winner = false;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void isWinner() {
        this.winner = true;
    }

    public boolean getWinner() {
        return this.winner;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
