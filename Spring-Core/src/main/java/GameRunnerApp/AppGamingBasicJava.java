package GameRunnerApp;

import GameRunnerApp.game.MarioGame;
import GameRunnerApp.game.gameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		var marioGame=new MarioGame();
		var gameRunner =new gameRunner(marioGame);
		gameRunner.run();
		
	}

}
