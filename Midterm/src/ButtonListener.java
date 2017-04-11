import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonListener implements ActionListener	{
	
	private Board board;
	
	public ButtonListener(Board board)	{
		this.board = board;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 	{
		if(event.getSource() instanceof TTTButton)	{
			TTTButton button = (TTTButton)event.getSource();
			if(button.getPlayerPiece() == null)	{
				PlayerOnCommand command = new PlayerOnCommand(board, GameManager.getInstance().getTurn(), button);
				board.getCommandController().setCommand(command);
				board.getCommandController().buttonWasPressed();
				board.notifyObservers();
			}
		}
		
		else
			board.getCommandController().undoLast();
	}	
}
