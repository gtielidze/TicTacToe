/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gio
 */
public class Game {

    private Player X;
    private Player O;
    private String[][] board = {{null, null, null}, {null, null, null}, {null, null, null}};
    private int count;

    public Game(Player first, Player second) {
        this.X = first;
        this.O = second;
        this.count = 0;
    }

    public void move(int row, int collumn) {
        board[row][collumn] = getSymbol();
        count++;
    }

    public String symbol() {
        if (count % 2 == 1) {
            return X.getSymbol();
        } else {
            return O.getSymbol();
        }
    }

    public String getSymbol() {
        if (count % 2 == 0) {
            return X.getSymbol();
        } else {
            return O.getSymbol();
        }
    }

    public boolean win() {

        String x = X.getSymbol() + X.getSymbol() + X.getSymbol();
        String o = O.getSymbol() + O.getSymbol() + O.getSymbol();

        String firstRow = this.board[0][0] + this.board[0][1] + this.board[0][2];
        String secondRow = this.board[1][0] + this.board[1][1] + this.board[1][2];
        String thirdRow = this.board[2][0] + this.board[2][1] + this.board[2][2];
        String firstColumn = this.board[0][0] + this.board[1][0] + this.board[2][0];
        String secondColumn = this.board[0][1] + this.board[1][1] + this.board[2][1];
        String thirdColumn = this.board[0][2] + this.board[1][2] + this.board[2][2];
        String firstDiagonal = this.board[0][0] + this.board[1][1] + this.board[2][2];
        String secondDiagonal = this.board[0][2] + this.board[1][1] + this.board[2][0];

        if (firstRow.equals(x) || secondRow.equals(x)
                || thirdRow.equals(x) || firstColumn.equals(x)
                || secondColumn.equals(x) || thirdColumn.equals(x)
                || firstDiagonal.equals(x) || secondDiagonal.equals(x)) {
            X.isWinner();
            return true;
        }

        if (firstRow.equals(o) || secondRow.equals(o)
                || thirdRow.equals(o) || firstColumn.equals(o)
                || secondColumn.equals(o) || thirdColumn.equals(o)
                || firstDiagonal.equals(o) || secondDiagonal.equals(o)) {
            O.isWinner();
            return true;
        }
        return false;
    }
}
