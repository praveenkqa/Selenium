package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	 
			//create new Fire fox Driver
			WebDriver d=new ChromeDriver();
			
			//Open website
			d.get("http://www.newtours.demoaut.com/");
			Thread.sleep(3000);
			
			//send the user name
			d.findElement(By.name("userName")).sendKeys("mahesh");
			Thread.sleep(3000);
			
			//send the password
			d.findElement(By.name("password")).sendKeys("mahesh");
			Thread.sleep(3000);
			
			//click on the sign in button
			d.findElement(By.name("login")).click();
			Thread.sleep(3000);
			
			//select the one way radio button
			Thread.sleep(3000);
			d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
			boolean b1=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).isSelected();
			if (b1==true)
			{
				System.out.println("one way is selected");
			}

			//select the round trip radio button
			Thread.sleep(3000);
			d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
			boolean b2=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).isSelected();
	        if (b2==true)
	        {
				System.out.println("round trip is selected");

	        }
	        //drop down list passengers
	        Thread.sleep(3000);
			Select drp=new Select(d.findElement(By.name("passCount")));
			
			Thread.sleep(3000);
	        drp.selectByValue("2");
	        
	        Thread.sleep(3000);
	        drp.selectByValue("3");
	        
	        Thread.sleep(3000);
	        drp.selectByValue("4");
	        
	        //drop down list departure
			Thread.sleep(3000);
			Select drop=new Select(d.findElement(By.name("fromPort")));
			
			Thread.sleep(3000);
	        drop.selectByValue("Frankfurt");
	        
	    	Thread.sleep(3000);
	        drop.selectByValue("London");
	        
	        Thread.sleep(3000);
	        drop.selectByValue("New York");
	        
	        Thread.sleep(3000);
	        drop.selectByValue("Paris");
	        
	        Thread.sleep(3000);
	        drop.selectByValue("Portland");
	        
	        Thread.sleep(3000);
	        drop.selectByValue("San Francisco");





	        
	        //select the first class
			Thread.sleep(3000);
	        d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
	        boolean b3=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).isSelected();
	        if (b3==true)
	        {
				System.out.println("first class is selected");

	        }
	        //select business class
			Thread.sleep(3000);
	        d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
	        boolean b4=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).isSelected();
	        if (b4==true)
	        {
				System.out.println("business class is selected");

	        }
	        //select economy class
			Thread.sleep(3000);
	        d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input")).click();
	        boolean b5=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input")).isSelected();
	        if (b5==true)
	        {
				System.out.println("economy class is selected");

	        }
	        //sign out
	        d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]")).click();
            d.close();
	}

}
