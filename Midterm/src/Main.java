import java.awt.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic Tac Toe");
		Board board = new Board();
		
		frame.add(board);
		frame.pack();
		
		
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
