package testprograms;


public class Sol1 {
	static int a[]={10,2,7,15,21};
	public static void main (String args [])
	{
	
	int n=a.length;
	int b=0;
	for(int i=0; i<n-1; i++)
	{
		for(int j=1; j<(n-i); j++)
		{
		
		if(a[j-1]>a[j])
		{
			b=a[j-1];
			a[j-1]=a[j];
			a[j]=b;
		}
		}
		
		for(int k=a[i];k<a[i+1];k++)
		{
			if(k==a[i]||k==a[i+1])
				continue;
			else
				System.out.print(k+" ");	
		}		
	}
		
}
}
