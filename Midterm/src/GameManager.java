import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class GameManager implements Observer
{
	private static GameManager instance;
	
	public static GameManager getInstance()	{
		if(instance != null)
			return instance;
		else
			return(instance = new GameManager());
	}
	
	private Board b;
	private Player t;
	
	private Player playerO = new Player("O");
	private Player playerX = new Player("X");
	
	private static final int[][] win1 = {{1,0,0},
										  {0,1,0},
										  {0,0,1}};

	private static final int[][] win2 = {{0,0,1},
										  {0,1,0},
										  {1,0,0}};
	
	private static final int[][] win3 = {{1,0,0},
										  {1,0,0},
										  {1,0,0}};

	private static final int[][] win4 = {{0,1,0},
										  {0,1,0},
										  {0,1,0}};
	
	private static final int[][] win5 = {{0,0,1},
										  {0,0,1},
										  {0,0,1}};
	
	private static final int[][] win6 = {{1,1,1},
										  {0,0,0},
										  {0,0,0}};

	private static final int[][] win7 = {{0,0,0},
										  {1,1,1},
										  {0,0,0}};

	private static final int[][] win8 = {{0,0,0},
										  {0,0,0},
										  {1,1,1}};
							
	private static final int[][][] WIN_MAPS = { win1, win2, win3, win4, win5, win6,win7, win8};

	@Override
	public void update() {
		Player lT = t;
		
		if(t == playerX)	
			t = playerO;
		
		else	
			t = playerX;
		
		checkWin(lT);
	}
	
	private GameManager()	{
		t = playerX;
	}
	
	protected void checkWin(Player player)	{
		for(int[][] map: WIN_MAPS)	{
			if(player.containsMap(map) == true)	{
				System.out.println(player.getPlayerName() + " is winner");
				b.winner.setText(player.getPlayerName() + " is winner");
			}
		}
	}

	
	public void setBoard(Board b)	{
		this.b = b;
	}
	
	public Player getTurn()	{
		return t;
	}
}