package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe_UC1 {
		
//		 declare 1d array of char type
		
		static char[] gameBoard = new char[10];

		/**
		 * method for creating empty GameBoard
		 */
		public void createGameBoard() {
			for (int a = 1; a < gameBoard.length; a++) {
				gameBoard[a] = ' ';
			}
		}

		public static void main(String[] args) {

			TicTacToe_UC1 ticTacToeMain = new TicTacToe_UC1();

			System.out.println("Welcome to TicTacToe Game");

			ticTacToeMain.createGameBoard();
		}

	}



