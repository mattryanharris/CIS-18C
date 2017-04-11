import java.util.ArrayList;
import java.util.List;

public class CommandController 
{
	Command s;
	
	List<Command> h;
	
	public CommandController()	{
		h = new ArrayList<Command>();
	}
	
	public void setCommand(Command c)	{
		s = c;
	}
	
	public void buttonWasPressed()	{
		s.execute();
		h.add(s);
	}
	
	public void undoLast()	{
		Command lastCom = h.get(h.size() -1);
		h.remove(h.size() -1);
		lastCom.undo();
	}
}
