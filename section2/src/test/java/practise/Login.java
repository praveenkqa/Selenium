package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//open the browser
		WebDriver dr= new ChromeDriver();
		
		
		// open facebook page https://www.facebook.com/
		
		dr.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// enter the user name
		
		dr.findElement(By.name("email")).sendKeys("praveen_9blues@yahoo.com");
		Thread.sleep(3000);
		
		// enter the password
		
		dr.findElement(By.id("pass")).sendKeys("Followdreams9569");
		Thread.sleep(3000);
		
		//click on login button
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		//click on profile
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='u_0_4']/div[1]/div[1]/div/a/span")).click();
		
		//click button
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		
		//click on logout button
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();		


	



	}

}
