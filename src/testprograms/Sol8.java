package testprograms;

/*import java.util.Scanner;*/

public class Sol8 {

	public static void main(String[] args)
	{
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();*/
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j< 7; j++)
			{	
				if(i==0||j==0||i==3||i==j&&i>3||j==6&&i<4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		
		}
		
	}

}
