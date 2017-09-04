package Peices;

public class Peice
{

	public static enum Contents
	{
		empty, pawn, rook, knight, bishop, king, queen
	};

	public boolean colour;

	public Contents contents = Contents.empty;

	public Peice(Contents spaceContents)
	{

		contents = spaceContents;
	}

	public String printCharSymbol()
	{
		String characterSymbol = "\u2654";
		switch (contents)
		{
		case king:
			if (colour)
			{
				characterSymbol = "\u2654";
			} else
			{
				characterSymbol = "\u265A";
			}
			break;
		case pawn:
			if (colour)
			{
				characterSymbol = "\u2659";
			} else
			{
				characterSymbol = "\u265F";
			}
			break;
		case rook:
			if (colour)
			{
				characterSymbol = "\u2656";
			} else
			{
				characterSymbol = "\u265C";
			}
			break;
		case knight:
			if (colour)
			{
				characterSymbol = "\u2658";
			} else
			{
				characterSymbol = "\u265E";
			}
			break;
		case bishop:
			if (colour)
			{
				characterSymbol = "\u2657";
			} else
			{
				characterSymbol = "\u265D";
			}
			break;
		case queen:
			if (colour)
			{
				characterSymbol = "\u2655";
			} else
			{
				characterSymbol = "\u265B";
			}
			break;
		default:
			characterSymbol = "\u25A2";
		}

		return characterSymbol;
	}

}
