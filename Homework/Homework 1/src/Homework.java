import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class Homework extends JFrame{
	
	//remember declared once and not again in destructor
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;

	public static void main(String[] args) {
		new Homework();
	}
	
	public Homework() {
		//sets size of window
		this.setSize(400,400);
		
		//gives us access to toolkit functions
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//gets screen size of computer
		Dimension dim = tk.getScreenSize();
		
		//uses screen size, divides in half, takes away from window size
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		//sets location on screen
		this.setLocation(xPos, yPos);
		
		//doesn't let user resize
		this.setResizable(false);
		
		//makes it so when you click frame X, app terminates
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets title of frame
		this.setTitle("My First Frame");
		
		//new panel is created
		JPanel thePanel = new JPanel();
		
		//new label is created displaying text
		JLabel label1 = new JLabel("Tell me something");
		
		//overwrites label1's original text
		label1.setText("New Text");
		
		//makes it so when tool tip hovers text appears
		label1.setToolTipText("Doesn't do anything");
		
		//this adds the label to the panel
		thePanel.add(label1);
		
		//creation of a button
		button1 = new JButton("Send");
		
		//calling on a private class listening for the button
		ListenForButton lForButton = new ListenForButton();
		
		//monitors for any action
		button1.addActionListener(lForButton);
		
		//creating hover text
		button1.setToolTipText("It's a button");
		
		//adding button to panel
		thePanel.add(button1);
		
		//creates new text field
		textField1 = new JTextField("", 15);
		
		//calling on private class listening for key presses
		ListenForKeys lForKeys = new ListenForKeys();
		
		//this listens for any key presses
		textField1.addKeyListener(lForKeys);
		
		//set text field width
		textField1.setColumns(10);
		
		//adds text field to panel
		thePanel.add(textField1);
		
		//creates text area with sizing
		textArea1 = new JTextArea(15, 20);
		
		//set text area default text
		textArea1.setText("Tracking events\n");
		
		//word wraps the text area
		textArea1.setLineWrap(true);
		
		//makes sure words don't get broken up on wrap
		textArea1.setWrapStyleWord(true);
		
		//keeps track of text area's number of lines
		int numOfLines = textArea1.getLineCount();
		
		//adds to text area default text
		textArea1.append("Number of lines: " + numOfLines);
		
		//adds scroll bars to text area, also designates this to textarea1
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//adds text area and scroll bar to panel
		thePanel.add(scrollbar1);
		
		//this adds the panel to our frame
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		
		//makes the window visible
		this.setVisible(true);
		
		//sets highlight focus on text field 1
		textField1.requestFocus();
		
		ListenForMouse lForMouse = new ListenForMouse();
		
		thePanel.addMouseListener(lForMouse);
		
	}
	
	//implement listeners
	
	private class ListenForButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				buttonClicked++;
				textArea1.append("Button clicked " + buttonClicked + " times\n");				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener {

		@Override
		//called when key is typed
		public void keyTyped(KeyEvent e) {
			textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
		}

		@Override
		//called when key is pressed and released
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		//called when key is hit
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ListenForWindow implements WindowListener {

		@Override
		public void windowOpened(WindowEvent arg0) {
			textArea1.append("Window is created");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is minimized");
			
		}

		@Override
		//went from minimized to normal
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window is normal state");
			
		}

		@Override
		public void windowActivated(WindowEvent arg0) {
			textArea1.append("Window is active");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Window is not active");
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel position: " + e.getX() + e.getY() + "\n");
			textArea1.append("Mouse Screen position: " + e.getXOnScreen() + e.getYOnScreen() + "\n");
			textArea1.append("Mouse Button: " + e.getButton() + "\n");
			textArea1.append("Mouse Clicks: " + e.getClickCount() + "\n");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
