package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
				//open the browser
				WebDriver dr= new ChromeDriver();
				
				Thread.sleep(2000);
				
				// open we buy page https://uk.webuy.com/
				
				dr.get("https://uk.webuy.com/");
				Thread.sleep(3000);
				
				// search for iPhone
				
				// enter i phone in the search text box
				Thread.sleep(3000);
				dr.findElement(By.id("stext")).sendKeys("iPhone");
				
				// click on search button
				Thread.sleep(3000);
				dr.findElement(By.xpath(".//*[@id='headersearch']/div[3]/input")).click();
				
				//Add the first item to cart
				Thread.sleep(3000);
				dr.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[1]/div[3]/div/a[2]/div")).click();
				
				
				// Add the second item to cart
				Thread.sleep(3000);
				dr.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[2]/div[3]/div/a[2]/div")).click();
				
				
				// get no.of items added in cart
				Thread.sleep(3000);
				String totalItems=dr.findElement(By.xpath(".//*[@id='buyBasketCount']")).getText();
				
				// verify that number of items added in cart is same as added items
				if(Integer.parseInt(totalItems)==2){
					
					
					System.out.println("The number of items in cart are same as actually added items");
					
				}
				
				else
					
				{
					
					System.out.println("The number of items in cart are not same as actually added items");
				}
				
				
				
				
				// click on view basket link
				Thread.sleep(3000);
				dr.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[2]/table/tbody/tr/td[2]/a[1]")).click();
				
				
				// get the total amount before removing the item from the cart
				Thread.sleep(3000);
				String totalBeforeRemoval= dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]")).getText();
				
				
				// remove the first item from the cart
				Thread.sleep(3000);
				dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[5]/a/img")).click();
				
				

				// get the total amount after removing the item from the cart
				Thread.sleep(3000);
				String totalAfterRemoval= dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]")).getText();
				
				
				// verify the whether the total is changed or not
				
				
				if(!(totalBeforeRemoval.equals(totalAfterRemoval))){
					
					System.out.println("Total is changed");
				}
				
				else{
					
					System.out.println("Total is not changed");
				}
				
				Thread.sleep(3000);
				// change the quantity to 2
				
				WebElement dropDown=dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[1]/div/select"));
				
				Select sel = new Select(dropDown);
				
				Thread.sleep(5000);
				
				sel.selectByIndex(1);
				
				// get total after changing the quantity
				
				
				
				String totalAfterChangingQuantity= dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]")).getText();
				
				
				// verify if total changes after changing the quantity
				
				if(!(totalAfterRemoval.equals(totalAfterChangingQuantity))){
					
					System.out.println("the total has changed after changing the quantity");
				}
				
				else{
					
					System.out.println("the total has not changed after changing the quantity");
				}

		       dr.close();
	}

}
