package Board;

import Peices.*;

public class Board
{
	public Peice[][] peices = new Peice[8][8];

	public Board()
	{
		for (int row = 0; row < 8; row++)
		{
			for (int space = 0; space < 8; space++)
			{
				if (row == 0 || row == 7)
				{
					if (space == 0 || space == 7)
					{
						peices[row][space] = new Peice(Peice.Contents.rook);
					} else if (space == 1 || space == 6)
					{
						peices[row][space] = new Peice(Peice.Contents.knight);
					} else if (space == 2 || space == 5)
					{
						peices[row][space] = new Peice(Peice.Contents.bishop);
					} else if (space == 3)
					{
						if (row == 0)
						{
							peices[row][space] = new Peice(Peice.Contents.queen);
							peices[row][space + 1] = new Peice(Peice.Contents.king);
						} else
						{
							peices[row][space] = new Peice(Peice.Contents.king);
							peices[row][space + 1] = new Peice(Peice.Contents.queen);
						}
					}

				} else if (row == 1 || row == 6)
				{
					peices[row][space] = new Peice(Peice.Contents.pawn);

				} else
				{
					peices[row][space] = new Peice(Peice.Contents.empty);

				}
			}
		}
	}

	public void printBoard()
	{
		for (Peice[] peiceRow : peices)
		{
			System.out.print("|");

			for (Peice peice : peiceRow)
			{
				System.out.print(peice.printCharSymbol());

				System.out.print("|");

			}
			System.out.println();
			System.out.println("-------------------");
		}

	}

}
