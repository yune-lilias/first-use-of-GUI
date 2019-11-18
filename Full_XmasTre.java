package hwfor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Full_XmasTre {
	public static void main(String arg[])
	{
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of row u want");
		 try {
			 n = sc.nextInt();
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 int i,star,space;
			
			//first triangle
			for(i=1;i<=n;i++)
			{
				for(space=1;space<=n-i;space++)
				{
					System.out.print(" ");
				}
				for(star=1;star<=i;star++)
				{
					System.out.print("* ");
				}
				System.out.print("\n");
			
	        }
			
	}
}
