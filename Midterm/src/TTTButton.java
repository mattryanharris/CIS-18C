import java.awt.Font;

import javax.swing.JButton;

import java.awt.*;
import playerpiece.PlayerPiece;

public class TTTButton extends JButton	{	
	int buttonIndex;
	private PlayerPiece player;
	
	TTTButton(int ref)	{
		buttonIndex = ref;
		this.setText(" ");
	}
	
	public void setPlayerPiece(PlayerPiece p)	{
		player = p;
		
		if(p != null) {
			this.setText(p.getPlayerName());
			this.setFont(new Font("Arial", Font.BOLD, 60));
			if (p.getPlayerName() == "X") 
				this.setForeground(Color.RED);

			else 
				this.setForeground(Color.BLUE);
		}
		
		else
			this.setText(" ");
	}
	
	public PlayerPiece getPlayerPiece()	{
		return player;
	}
}
