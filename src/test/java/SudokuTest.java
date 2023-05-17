import com.demo.Sudoku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SudokuTest {
    @Test
    void isNumberValid_Success() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 7;
        int[] position = {6, 4};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertTrue(numberValid);
    }

    @Test
    void isNumberValid_Success2() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 5;
        int[] position = {4, 4};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertTrue(numberValid);
    }

    @Test
    void isNumberValid_Fail_SameInSubDesc() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 2;
        int[] position = {8, 8};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertFalse(numberValid);
    }

    @Test
    void isNumberValid_Fail_SameInSubDesc2() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 5;
        int[] position = {6, 9};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertFalse(numberValid);
    }

    @Test
    void isNumberValid_Fail_SameInRow() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 4;
        int[] position = {2, 5};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertFalse(numberValid);
    }

    @Test
    void isNumberValid_Fail_SameInColumn() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 9;
        int[] position = {5, 5};

        boolean numberValid = Sudoku.isNumberValid(number, board, position);
        Assertions.assertFalse(numberValid);
    }

    @Test
    void isNumberValid_InvalidValue() {
        int[][] board = {
            //   1  2  3  4  5  6  7  8  9
                {5, 3, 0, 0, 7, 0, 0, 0, 0}, // 1
                {6, 0, 0, 1, 9, 5, 0, 0, 0}, // 2
                {0, 9, 8, 0, 0, 0, 0, 6, 0}, // 3
                {8, 0, 0, 0, 6, 0, 0, 0, 3}, // 4
                {4, 0, 0, 8, 0, 3, 0, 0, 1}, // 5
                {7, 0, 0, 0, 2, 0, 0, 0, 6}, // 6
                {0, 6, 0, 0, 0, 0, 2, 8, 0}, // 7
                {0, 0, 0, 4, 1, 9, 0, 0, 5}, // 8
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  // 9
        };
        int number = 8;
        int[] position = {3, 3};

        Assertions.assertThrows(IllegalArgumentException.class, () -> Sudoku.isNumberValid(number, board, position));
    }
}