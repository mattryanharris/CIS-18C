import javax.swing.*;
import java.awt.*;

public class A extends JApplet {

	public void init() {
		getContentPane().setBackground(Color.cyan);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		//large red box
		g.setColor(Color.red);
		g.drawLine(0, 0, 200, 0);
		g.drawLine(200, 0, 200, 200);
		g.drawLine(200, 200, 0, 200);
		g.drawLine(0, 200, 0, 0);
		
		//small blue box
		g.setColor(Color.blue);
		g.drawLine(50, 50, 100, 50);
		g.drawLine(100, 50, 100, 100);
		g.drawLine(100, 100, 50, 100);
		g.drawLine(50, 100, 50, 50);

	}

}
