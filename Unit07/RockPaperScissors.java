//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private int playNum, compNum;
	private String playChoice, winner;

	public RockPaperScissors()
	{
		playNum = 0;
		compNum = (int) (3 * (Math.random()));
		winner = "";
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		if(playChoice.equalsIgnoreCase("R")) {
			playNum = 0;
		}
		if(playChoice.equalsIgnoreCase("P")) {
			playNum = 1;
		}
		if(playChoice.equalsIgnoreCase("S")) {
			playNum = 2;
		}
	}

	public String determineWinner( )
	{
		if(playNum == compNum) {
			winner = "draw";
		}
		else if(playNum == 2 && compNum == 1) {
			winner = "player wins";
		}
		else if(playNum == 0 && compNum == 2) {
			winner = "player wins";
		}
		else if(playNum == 1 && compNum == 0) {
			winner = "player wins";
		}
		else if(playNum == 1 && compNum == 2) {
			winner = "comp wins";
		}
		else if(playNum == 2 && compNum == 0) {
			winner = "comp wins";
		}
		else if(playNum == 0 && compNum == 1) {
			winner = "comp wins";
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}