import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
	public Board() {
		int ref = 1;
		this.setLayout(new GridLayout(3,3,5,5));
		for(int i = 0; i < 9; i++) {	

			int x = i % 3;
			int y = i / 3;
			
			JButton button = ButtonGenerator.createButton(x, y, ref);
			ref++;
			this.add(button);
		}
	}
}
