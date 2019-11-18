package hwfor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Half_XmasTre {
	public static void main(String arg[])
	{
		int k = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number of row u want");
	 try {
		 k = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i,j;

		for(i=k;i>=1;i--)
		{
		for(j=1;j<=i;j++)
			{
		 	System.out.print("* ");
		}
		System.out.print("\n");
		}
		
	}
}
