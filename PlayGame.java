/********************
 * 
 * Name : Lamha Goel
 * Roll No. : 2015050
 * 
 ********************/


import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPuzzle game=new MyPuzzle();
		Scanner s=new Scanner(System.in);
		char input='X';
		boolean moved;
		System.out.println("Initial grid:");
		game.displayGrid();
		while(true && input!='Q')
		{
			if(game.isOver())
			{
				System.out.println("Game Over");
			}
			System.out.print("User input: ");
			input=s.next().charAt(0);
			switch(input)
			{
			case 'r' :
			case 'R' : moved=game.moveRight();
						if(!moved)
						{
							System.out.println("Invalid move, no tile can move right");
						}
						else
						{
							game.displayGrid();
						}
						break;
			case 'l' :
			case 'L' : moved=game.moveLeft();
						if(!moved)
						{
							System.out.println("Invalid move, no tile can move left");
						}
						else
						{
							game.displayGrid();
						}
						break;
			case 'd' :
			case 'D' : moved=game.moveDown();
						if(!moved)
						{
							System.out.println("Invalid move, no tile can move down");
						}
						else
						{
							game.displayGrid();
						}
						break;
			case 'u' :
			case 'U' : moved=game.moveUp();
						if(!moved)
						{
							System.out.println("Invalid move, no tile can move up");
						}
						else
						{
							game.displayGrid();
						}
						break;
			case 'q' :
			case 'Q' : System.out.println("Goodbye!");
						break;
			default : System.out.println("Invalid Input");
			}
			game.hasWon();
		}
	}

}
