import javax.swing.*;
public class TTTButton extends JButton {
	private int x, y;
	
	TTTButton(int x, int y, int ref) {
		this.x = x;
		this.y = y;
		this.setText(Integer.toString(ref));
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
