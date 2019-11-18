package hwfor;

import java.util.Scanner;

public class XMarksDaSpot {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number n:  ");
		System.out.println("P.S.: the result would be 2n+1 * 2n+1 ");
		int n=sc.nextInt();
		int i,spots;
		for(i=1;i<=2*n+1;i++)
		{
			for(spots=1;spots<=(n+1-Math.abs(i-n-1))-1;spots++)
			{System.out.print("¡¤ ");}
			System.out.print("* ");
			for(spots=1;spots<=2*n+1-2*(n+1-Math.abs(i-n-1));spots++)
			{System.out.print("¡¤ ");}
			if(i!=(n+1))
			{System.out.print("* ");}
			for(spots=1;spots<=(n+1-Math.abs(i-n-1))-1;spots++)
			{System.out.print("¡¤ ");}
			System.out.print("\n");
		}
	}
}
