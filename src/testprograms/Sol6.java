package testprograms;

public class Sol6 {

	public static void main(String[] args)
	{
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j< 7; j++)
			{	
				if(i==j||(i+j)==6||j==6||j==0||i==0||i==6)
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
