package hwfor;

import java.util.Scanner;

public class Guess_A_Number {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int t = 0;
		String again = null;
//		System.out.println(t);
		int in = 0;
		String temp;
		int step;
		Boolean win = false;
		Boolean correctform = false;
		int k = 0;
		for(step =1;step>0;step++)	
		{
		if(step ==1)
		{
		System.out.println("Please input the maxmum of the random number");
		temp = sc.next();
		temp = temp.trim();
		k = Integer.parseInt(temp);
		t = (int)(Math.random()*(k-1)+1);
		while(t == 0)
		{t = (int)(Math.random()*(k-1))+1;}
		System.out.println("A new secret number has been choosen.");
		System.out.print("Enter guess: ");
		temp = sc.next();
		temp = temp.trim();
		in = Integer.parseInt(temp);
		again = "dne";
		win = false;
		correctform = false;
		}
			if(in <0||in>=k+1)
			{System.out.println("Hey, ur input number is out of the range u set up");
			System.out.print("Enter guess: ");}
			else if(in < t)
			{
			System.out.println("Too low; try again");
			System.out.print("Enter guess: ");
			}
			else if(in > t)
			{
			System.out.println("Too high; try again");
			System.out.print("Enter guess: ");
			}
			else if(in == t)
			{
			System.out.println("You won in "+step+" guesses");
			win = true;
			while(!correctform)
			{
			System.out.println("\nPlay again? (y/n)\n");
			again = sc.next();
			if(again.equalsIgnoreCase("y")||again.equalsIgnoreCase("n"))
			{correctform = true;}
			else
			{System.out.println("\nerror: program cannot recognize ur input, please try again\n");
			again = sc.next();}
			}
	        }
			if(win&&again.equalsIgnoreCase("y"))
			{step = 0;
			in = k - in +1;
			win = false;
			}
			else if(win&&again.equalsIgnoreCase("n")){step = -1;}
			else {
				temp = sc.next();
			temp = temp.trim();
			in = Integer.parseInt(temp);
			}
			
	}
	}
}
