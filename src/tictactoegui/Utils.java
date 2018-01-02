/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegui;

/**
 *
 * @author Priya
 */
public class Utils {
    
    public static boolean isFull(String[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static String[][] duplicateBoard(String[][] board) {
        String[][] newBoard = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                newBoard[row][col] = board[row][col];
            }
        }
        return newBoard;
    }
}
