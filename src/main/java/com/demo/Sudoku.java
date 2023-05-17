package com.demo;

public class Sudoku {
    public static void main(String[] args) {

    }

    public static boolean isNumberValid(int number, int[][] board, int[] position) {
        Validator.isFigureValid(number);
        Validator.isPositionValid(position);
        Validator.isBoardValid(board);
        Validator.numberPlacedInPosition(number, board, position);

        // Call the first implementation and measure  execution time
        long startTime1 = System.currentTimeMillis();
        boolean method1 = method1(number, board, position);
        long endTime1 = System.currentTimeMillis();
        long executionTime1 = endTime1 - startTime1;
        System.out.printf("Method1 execution time: %s milliseconds%n", executionTime1);

        return method1;
    }

    private static boolean method1(int number, int[][] board, int[] position) {
        int x = position[0];
        double doubleX = x;
        int y = position[1];
        double doubleY = y;
        int subBoardsCount = SudokuBoard.BOARD_SIZE / SudokuBoard.SUB_BOARD_SIZE;

        double subBoardX = Math.ceil(doubleX / subBoardsCount);
        double subBoardY = Math.ceil(doubleY / subBoardsCount);


        for (int iter = 0; iter < SudokuBoard.BOARD_SIZE; iter++) {
            if (board[iter][x - 1] == number) {
                System.out.printf("Number %s present in a column%n", number);
                return false;
            }
            if (board[y - 1][iter] == number) {
                System.out.printf("Number %s present in a row%n", number);
                return false;
            }
            double doubleIter = iter + 1.0;
            double ceil = Math.ceil(doubleIter / subBoardsCount);
            if (subBoardY == ceil) {
                // This part can be optimized for speed, but memory usage will increase.
                // We can store values for rows that meet the condition (if (subBoardY == ceil)) in a temporary array.
                // When the condition (subBoardX == subCeil) is true, we need to take the required value from this array and equalize board[iter][iterSub] == number.
                // Plus: we will get rid of the nested loop;
                // Minus: we will have to store an additional new array of values
                for (int iterSub = 0; iterSub < SudokuBoard.BOARD_SIZE; iterSub++) {
                    double doubleSubIter = iterSub + 1.0;
                    double subCeil = Math.ceil(doubleSubIter / subBoardsCount);
                    if (subBoardX == subCeil && board[iter][iterSub] == number) {
                        System.out.printf("Number %s present in a sub-desc%n", number);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
