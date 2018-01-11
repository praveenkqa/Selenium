package practise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			
			WebDriver dr= new ChromeDriver();
			
			Thread.sleep(2000);
			
			dr.get("https://www.walgreens.com/");
			
			Thread.sleep(2000);
			
			Assert.assertEquals(dr.getTitle(), "Welcome to Walgreens - Your Home for Prescriptions, Photos and Health Information");
			
			Actions mouseOver= new Actions(dr);
			Thread.sleep(2000);
			
			mouseOver.moveToElement(dr.findElement(By.linkText("Health Info & Services" ))).build().perform();
			
			Thread.sleep(2000);
			
			dr.findElement(By.xpath(".//*[@id='wag-header-mobile-slider']/nav/ul/li[4]/ul/li[4]/section/a")).click();
			
			Thread.sleep(2000);
			
			dr.findElement(By.linkText("Vaccine Consent Form ›")).click();

	}

}
