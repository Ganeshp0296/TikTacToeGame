package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe_UC3 {

	char[] gameBoard = new char[10]; // declare 1d array of char type
	public char Computerletter;
	public char Playerletter;
	Scanner scanner = new Scanner(System.in);

	/**
	 * method for creating empty GameBoard
	 */
	public void createGameBoard() {
		for (int a = 1; a < gameBoard.length; a++) {
			gameBoard[a] = ' ';
		}
	}

	/**
	 * method for choose Letter X or O
	 */
	public void selectLetter() {
		int flag = 0;
		while (flag == 0) {
			System.out.print("\n Choose your Letter\n Press 1 -> 'X'\n Press 2 -> 'O'\n Enter your Choice -> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Playerletter = 'X';
				Computerletter = 'O';
				System.out.println("\n Player letter -> " + Playerletter);
				System.out.println("Computer letter -> " + Computerletter);
				flag = 1;
				break;
			case 2:
				Playerletter = 'O';
				Computerletter = 'X';
				System.out.println("\nPlayer letter -> " + Playerletter);
				System.out.println("Computer letter -> " + Computerletter);
				flag = 2;
				break;
			default:
				System.out.println("\n plz enter 1 or 2");
			}
		}
	}

	/**
	 * method for display Board
	 */
	public void showBoard() {
		System.out.println("  " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + "  ");
		System.out.println("----|---|----");
		System.out.println("  " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + "  ");
		System.out.println("----|---|----");
		System.out.println("  " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + "  ");
	}

	public static void main(String[] args) {

		TicTacToe_UC3 ticTacToeMain = new TicTacToe_UC3();
		System.out.println("Welcome to TicTacToe Game");
		ticTacToeMain.createGameBoard();
		ticTacToeMain.selectLetter();
		ticTacToeMain.showBoard();
	}
}