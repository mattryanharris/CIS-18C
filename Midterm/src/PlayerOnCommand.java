
import playerpiece.PlayerPieceGenerator;

public class PlayerOnCommand implements Command
{
	Board b;
	TTTButton pressedB;
	Player player;
	
	public PlayerOnCommand(Board b, Player p, TTTButton bP)	{
		this.b = b;
		this.pressedB = bP;
		this.player = p;
	}
	
	@Override
	public void execute() {
		player.changeMap(pressedB.buttonIndex);
		pressedB.setPlayerPiece(PlayerPieceGenerator.createPlayer(player.getPlayerName()));
		b.setLastPress(pressedB);
	}

	@Override
	public void undo() {
		player.changeMap(pressedB.buttonIndex);
		pressedB.setPlayerPiece(null);
		b.notifyObservers();
	}

}
