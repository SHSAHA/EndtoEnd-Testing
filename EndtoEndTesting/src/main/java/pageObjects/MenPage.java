package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenPage {
	
	public WebDriver driver;
	
    By shoptrend=By.xpath("//span[contains(text(),'SHOP THE TREND')]");
	
	public MenPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getTrendPage()
	{
		return driver.findElement(shoptrend);
	}	
	
    }


