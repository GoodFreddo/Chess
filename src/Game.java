import java.util.Scanner;

import Board.Board;

public class Game
{
	private Board board = new Board();
	private Scanner scanner;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner gameScanner = new Scanner(System.in);
		Game game = new Game(gameScanner);
		game.Start();
		gameScanner.close();

	}

	private Game(Scanner gameScanner)
	{
		this.scanner = gameScanner;
	}

	private void Start()
	{
		// TODO Auto-generated method stub
		board.printBoard();

	}

}
