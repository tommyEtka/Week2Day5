package DayI10;

import java.util.Formatter;

import java.util.*;

//import java.math.*;

public class codeChallenge {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();

		System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8");
        System.out.print("----------------------------------------------------------------------------");
		System.out.println(fmt);

		final int rowWidth = 9;
		final int colHeight = 9;

		Random rand = new Random();
		int[][] board = new int[rowWidth][colHeight];

		for (int row = 0; row < board.length; row++) {

			for (int col = 0; col < board[row].length; col++) {

				board[row][col] = rand.nextInt(100);

			}

		}

		// display output

		for (int i = 0; i < board.length; i++) {
			System.out.print(i + "|\t");
			for (int j = 0; j < board[i].length; j++) {
				
				System.out.print(board[i][j] + "\t");
				
			}

			System.out.println();

		}

	}

}

// TODO Auto-generated method stub
