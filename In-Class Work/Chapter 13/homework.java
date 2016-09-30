import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class homework {

	public static void main(String[] args) {
		JFrame f = new JFrame("Word Updater");
		f.setSize(250, 260);
		
		final Container c = f.getContentPane();
		c.setBackground(Color.black);
		c.setLayout(null);
		
		final JLabel wordLabel = new JLabel("Selected Word: ");
		wordLabel.setOpaque(true);
		wordLabel.setForeground(Color.white);
		wordLabel.setBackground(Color.black);
		wordLabel.setSize(110, 35);
		wordLabel.setLocation(25, 10);
		c.add(wordLabel);

		final JTextField word = new JTextField("");
		word.setOpaque(true);
		word.setLocation(25, 40);
		word.setSize(200,35);
		c.add(word);
		
		final JButton updateButton = new JButton("Update Word");
		updateButton.setOpaque(true);
		updateButton.setSize(120, 30);
		updateButton.setLocation(25, 85);
		c.add(updateButton);
		
		final JLabel currentWord = new JLabel("CURRENT WORD: ");
		currentWord.setSize(110, 35);
		currentWord.setForeground(Color.white);
		currentWord.setBackground(Color.black);
		currentWord.setLocation(25, 125);
		c.add(currentWord);
		
		final JLabel actualWord = new JLabel("Empty");
		actualWord.setSize(110, 35);
		actualWord.setForeground(Color.white);
		actualWord.setBackground(Color.black);
		actualWord.setLocation(134, 125);
		c.add(actualWord);
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				actualWord.setText(word.getText());
			}
		});

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
	    f.setLocation(x, y);
	    
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
