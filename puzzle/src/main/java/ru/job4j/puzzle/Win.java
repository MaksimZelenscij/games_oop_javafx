package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int j = 0; j < board.length; j++) {
            if ((monoHorizontal(board, j) || monoVertical(board, j))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int line = 0; line < board[row].length; line++) {
            if (board[row][line] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int pillar = 0; pillar < board[column].length; pillar++) {
            if (board[pillar][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}


