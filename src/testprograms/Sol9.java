package testprograms;

public class Sol9
{
public static void main(String args[])
{
	int n=10; int rem=0;
			;
	String bin=" ";
	while(n>0)
	{
		rem=n%2;
		bin=rem+bin;
		n=n/10;
	}
	System.out.println(bin);
}
}
