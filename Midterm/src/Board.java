
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Board extends JPanel	{
	private ButtonListener listener;
	private List<Observer> observers;
	private TTTButton lastPressedButton;
	private CommandController commandController;
	public JLabel winner;
	
	public Board()	{

		observers = new ArrayList<Observer>();
		listener = new ButtonListener(this);
		commandController = new CommandController();

		GridLayout layout = new GridLayout(4,3, 10,10);
		
		for(int i = 1; i < 10; i++)	{
			TTTButton button = new TTTButton(i);
			button.addActionListener(listener);
			this.add(button);	
		}
		
		winner = new JLabel();
		
		JButton undoButton = new JButton(new ImageIcon("./icon.png"));
		undoButton.addActionListener(listener);
		this.add(undoButton);
		this.add(winner);
		this.setLayout(layout);
	}
	
	public void addObserver(Observer observer)	{
		observers.add(observer);
	}
	
	public void notifyObservers()	{
		for(Observer o: observers)
			o.update();
	}
	
	public void setLastPress(TTTButton button)	{
		lastPressedButton = button;
	}
	
	public TTTButton getLastPressed()	{
		return lastPressedButton;
	}
	
	public CommandController getCommandController()	{
		return commandController;
	}
	
	public String getLabel(String string) {
		return string;
	}
	
	public void setLabel(String string) {
		
	}
}
