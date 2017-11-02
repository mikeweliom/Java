package java_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pattern 
{

	public static void main(String[] args)
	{int n=4,m=4;
	char ch='A',k;
	for(int i=1;i<=n;i++){
		k=ch;
	for(int j=1;j<=m;j++){
		if(i+j>=(n+1))
		{	
			if(j==4)
			{
			System.out.print(ch++);
			}
			else
			{
				k=(char)(k+n-(j-1));
				System.out.print(k);
			}
			
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
