import java.awt.*;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Board extends JPanel
{
	public Board()
	{
		GridLayout layout = new GridLayout(3,3,8,8);
		for(int i = 1; i < 10; i++)
		{
			JButton button = ButtonGenerator.createButton(i);
			this.add(button);
			
		}
		this.setLayout(layout);
	}
}
