package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBagPage {
public WebDriver driver;
	
	 
	    By getcheckout=By.linkText("CHECKOUT");
		
		public MyBagPage(WebDriver driver) {
			this.driver=driver;
		}
	

		public WebElement getCheckOutPage()
		{
			return driver.findElement(getcheckout);
		}	

        }
