package lab4;
import java.util.*;

public class CheckerBoard {

	public static void main(String[] args) {
		int[][] board = new int[8][8];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
		
		int[][] test = {{1, 1, 1}, {1, 0, 1}, {0, 0, 0}};
		checkRows(test);
	}
	
	public static void checkRows(int[][] board) {
		boolean all = true;
		for(int i = 0; i <board.length; i++) {
			int num = board[i][0];
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] != num) {
					all = false;
					break;
				}
			}
			if(all) {
				System.out.println("All " + num + "'s on row " + i);
				all = false;
			}
			
		}
	}
	
	public static void checkCol() {
			
	}
	
	public static void checkMajorDiag() {
		
	}
	
	public static void checkMinorDiag() {
		
	}
}
