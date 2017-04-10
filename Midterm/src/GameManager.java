
public class GameManager {
	private static GameManager instance;
	
	public static GameManager getInstance() {
		if(instance != null) {
			return instance;
		}
		
		else {
			return(instance = new GameManager());
		}
	}
		private User turn;
		
		class User {
			private int map[][] = {{0,0,0},{0,0,0},{0,0,0}};
			int playerNum;
			
			public User(int i) {
				
			playerNum = i;
			}
			
			public int getPlayerNum()  {
				return playerNum;
			}
		}
		
		User player_X = new User(1);
		User player_O = new User(2);
		
		private GameManager() {
			turn = player_X;
		}
		
	}
}

