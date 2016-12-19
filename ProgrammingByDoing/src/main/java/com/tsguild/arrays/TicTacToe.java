/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arrays;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TicTacToe {

    private static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    private static boolean keepGoing;

    public static void main(String[] args) {

        initBoard();
        displayBoard();
        boolean keepGoing = true;
        while (keepGoing) {
            keepGoing = takeTurnO();
            keepGoing = takeTurnX(keepGoing);
        }
        printResults();

    }
    
    public static void printResults(){
        if (hasWon('X')) System.out.println("X's win!");
        else if (hasWon('O')) System.out.println("O's take it!");
        else if (draw()) System.out.println("It's a tie.");
    }

    public static boolean takeTurnO() {
        System.out.println("'O', choose your location (row, column): ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        while (board[r][c] == 'O' || board[r][c] == 'X') {
            System.out.println("Already taken. Choose again.");
            r = sc.nextInt();
            c = sc.nextInt();
        }
        board[r][c] = 'O';
        displayBoard();
        keepGoing = !(hasWon('O') || draw());
        return keepGoing;
    }

    public static boolean takeTurnX(boolean keepGoing) {
        if (keepGoing) {
            System.out.println("'X', choose your location (row, column): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            while (board[row][col] == 'O' || board[row][col] == 'X') {
                System.out.println("Already taken. Choose again.");
                row = sc.nextInt();
                col = sc.nextInt();
            }
            board[row][col] = 'X';
            displayBoard();
            keepGoing = !(hasWon('X') || draw());
            return keepGoing;
        } else {
            return false;
        }
    }

    public static boolean draw() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    count++;
                }
            }
        }
        if (count == 9) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasWon(char n) {
        if (board[0][0] == n && board[0][1] == n && board[0][2] == n) {
            return true;
        } else if (board[1][0] == n && board[1][1] == n && board[1][2] == n) {
            return true;
        } else if (board[2][0] == n && board[2][1] == n && board[2][2] == n) {
            return true;
        } else if (board[0][0] == n && board[1][0] == n && board[2][0] == n) {
            return true;
        } else if (board[0][1] == n && board[1][1] == n && board[2][1] == n) {
            return true;
        } else if (board[0][2] == n && board[1][2] == n && board[2][2] == n) {
            return true;
        } else if (board[0][0] == n && board[1][1] == n && board[2][2] == n) {
            return true;
        } else if (board[0][2] == n && board[1][1] == n && board[2][0] == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void displayBoard2() {
        for (int r = 0; r < 3; r++) {
            System.out.print("\t" + r + " ");
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
}
