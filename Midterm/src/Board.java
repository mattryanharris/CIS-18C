import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
	
	GridBagConstraints gbc;
	
	public Board() {
		
		int ref = 1;
		
		gbc = new GridBagConstraints();
		gbc.ipadx = gbc.ipady = 30;
		gbc.fill = GridBagConstraints.BOTH;
		
		this.setLayout(new GridBagLayout());
				
		for(int i = 0; i < 9; i++) {	

			int x = i % 3;
			int y = i / 3;
			
			JButton button = ButtonGenerator.createButton(x, y, ref);
			
			gbc.gridx = x;
			gbc.gridy = y;
			
			ref++;
			this.add(button, gbc);	
		}
	}
}
