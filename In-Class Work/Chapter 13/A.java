import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class A {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Space Invaders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Space space = new Space();
		frame.add(space);
		
		frame.setSize(600, 500);
		frame.setVisible(true);
	}
}

class Space extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random r = new Random();
		setBackground(Color.black);
		
		//Stars
		g.setColor(Color.white);
		for(int i = 1; i < 1000; i++) {
			g.fillOval(r.nextInt(600), r.nextInt(500), 1, 2);
		}
		
		//Aliens
		
		for(int y = 0; y < 100; y += 20) {
			for (int x = 0; x < 500; x += 50) {
				g.setColor(Color.yellow);
				g.fillOval(55 + x, 50 + y, 10, 10);
				g.setColor(Color.magenta);
				g.fillOval(50 + x, 55 + y, 20, 5);
			}
		}
		
		//Shields
		
		for(int x = 0; x < 500; x += 100) {
			g.setColor(Color.green);
			g.fillRect(65 + x, 350, 40, 20);
			g.setColor(Color.black);
			g.fillRect(75 + x, 360, 20, 10);

			
		}
	}
}

