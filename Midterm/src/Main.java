import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args)	{
		JFrame f = new JFrame("T-T-T");
		Board b = new Board();
		GameManager.getInstance().setBoard(b);
		b.addObserver(GameManager.getInstance());
		
		f.setBackground(Color.BLACK);
		f.add(b);
		f.pack();
		f.setMinimumSize(new Dimension(200,400));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
