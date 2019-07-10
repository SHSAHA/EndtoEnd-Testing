package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	public WebDriver driver;
	
	 
    By getcontinuetocheckout = By.cssSelector("input[type='submit'][value='Continue to checkout']");
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getContinueToCheckOut()
	{
		return driver.findElement(getcontinuetocheckout);
	}	


    }
