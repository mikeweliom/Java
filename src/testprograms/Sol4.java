package testprograms;

public class Sol4 {

	public static void main(String[] args)
	{	int a=1;
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				if(a<=9)
				{
				System.out.print(a);
				a++;
				}else{
					a=1;
					System.out.print(a);
					a++;
				}
			}
			System.out.println();
		}
		
	}

}
