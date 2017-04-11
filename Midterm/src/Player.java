public class Player 
{
	private int map[][] = {{0,0,0},{0,0,0},{0,0,0}};
	private String playerName;
	
	public Player(String name)	{
		playerName = name;
	}
	
	public String getPlayerName()	{
		return this.playerName;
	}
	
	public void changeMap(int c)	{
		c = c - 1;
		System.out.println(c);
		int xPos = c%3;
		int yPos = c/3;
		
		if(map[xPos][yPos] == 0)
			map[xPos][yPos] = 1;
		else
			map[xPos][yPos] = 0;
	}	
	
	public boolean containsMap(int[][] map)	{		
		for(int x = 0; x < 3; x++)	{
			for(int y = 0; y < 3; y++)	{
				if(map[x][y] == 1)	{
					if(this.map[x][y] != 1)	{
						return false;
					}
				}
			}
		}
		
		return true;
		}
	
	public int[][] getMap()	{
		return map;
	}
}
