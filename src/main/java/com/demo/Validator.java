package com.demo;

import java.util.Arrays;

public class Validator {

    public static void isFigureValid(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("Value can't be less then 1 or more than 9");
        }
    }


    public static void isBoardValid(int[][] board) {
        if (board.length != SudokuBoard.BOARD_SIZE) {
            throw new IllegalArgumentException(String.format("Board columns should be - %s", SudokuBoard.BOARD_SIZE));
        }
        for (int column = 0; column < SudokuBoard.BOARD_SIZE - 1; column++) {
            if (board[column].length != SudokuBoard.BOARD_SIZE) {
                throw new IllegalArgumentException(String.format("Board rows should be - %s", SudokuBoard.BOARD_SIZE));
            }
        }
    }

    public static void isPositionValid(int[] position) {
        if (position.length != 2) {
            throw new IllegalArgumentException("Position should contains two values");
        }
        Arrays.stream(position).forEach(Validator::isFigureValid);
    }

    public static void numberPlacedInPosition(int number, int[][] board, int[] position) {
        if (board[position[0] - 1][position[1] - 1] == number) {
            throw new IllegalArgumentException(String.format("Position already contains number - %s", number));
        }
    }
}
