//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
			int y = 0;
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			String one = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();		
			game.setPlayers(one);
			System.out.println(game.determineWinner());
			System.out.println("Do you want to play again?");
			String resp = keyboard.next();
			if(resp.equalsIgnoreCase("y")) {
				y = 1;
				while( y == 1) {
					one = keyboard.next();
					game.setPlayers(one);
					System.out.println(game.determineWinner());
					System.out.println("Do you want to play again?");
					resp = keyboard.next();
				}
			}
	}
}



