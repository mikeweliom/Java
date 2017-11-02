package java_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageVerification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/tyss/Desktop/geckodriver");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[5]/a")).click();
		String s = "http://www.seleniumhq.org/projects/";
		String s1 = d.getCurrentUrl();
		if(s.equals(s1)){
			System.out.println("Matching");
		}else{
			System.out.println("Not matching");
		}
		d.quit();
	}

}
