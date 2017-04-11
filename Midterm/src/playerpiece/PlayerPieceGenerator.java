package playerpiece;

public class PlayerPieceGenerator {
	public static PlayerPiece createPlayer(String type)	{
		if(type.equals("X"))
			return new PlayerX();
		
		else
			return new PlayerO();
	}
}
