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
		
		//add in a do while loop after you get the basics up and running
		
			out.print("type in your prompt [R,P,S] :: ");
			
			String one = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();		
			game.setPlayers(one);
			System.out.println(game.determineWinner());
			System.out.println("Do you want to play again? [y, n]");
			String resp = keyboard.next();
				while(resp.equalsIgnoreCase("y")) {
				out.print("type in your prompt [R,P,S] :: ");
				resp = keyboard.next();
				game.setPlayers(one);
				System.out.println(game.determineWinner());
				System.out.println("Do you want to play again? [y, n]");
				resp = keyboard.next();
				}
			if(resp.equalsIgnoreCase("n")) {
				out.println("Thanks for playing!");
			}
}
}