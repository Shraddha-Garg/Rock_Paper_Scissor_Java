package game;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Game Rules: \n 0 --> Rock   1 --> Paper   2 --> Scissor \nIt will be a 5-series game.... Gd Luck");
		int i=1, c1=0, c2=0;
		while(i<=5) {
			int p1= rand.nextInt(3);
			System.out.println("Your Turn :- ");
			int p2= sc.nextInt();
			if((p1==0 && p2==2) || (p1==1 && p2==0) || (p1==2 && p2==1)) {
				System.out.println("Computer Choice: " + p1);
				if(p1 == 0)
					System.out.print(p1 + "--> Rock");
				else if(p1 == 1)
					System.out.print(p1 + "--> Paper");
				else
					System.out.print(p1 + "--> Scissor");
				c1++;
				System.out.println("\nScores:\n You: " + c2 + "\t Computer: " + c1);
			}
			if((p1==2 && p2==0) || (p1==0 && p2==1) || (p1==1 && p2==2)) {
				System.out.println("Computer Choice: " + p1);
				if(p1 == 0)
					System.out.print(p1 + "--> Rock");
				else if(p1 == 1)
					System.out.print(p1 + "--> Paper");
				else
					System.out.print(p1 + "--> Scissor");
				c2++;
				System.out.println("\nScores:\n You: " + c2 + "\t Computer: " + c1);
			}
			if((p1==0 && p2==0) || (p1==1 && p2==1) || (p1==2 && p2==2)) {
				System.out.println("Computer Choice: " + p1);
				if(p1 == 0)
					System.out.print(p1 + "--> Rock --> Draw");
				else if(p1 == 1)
					System.out.print(p1 + "--> Paper --> Draw");
				else
					System.out.print(p1 + "--> Scissor --> Draw");
				System.out.println("\nScores:\n You: " + c2 + "\t Computer: " + c1);
				
			}
			i++;
		}
		if(c1>c2)
			System.out.println("You lost... Better Luck Next Time");
		else if(c2>c1)
			System.out.println("Congrats.... You Won!!");
		else
			System.out.println("Match draw");
	}

}
