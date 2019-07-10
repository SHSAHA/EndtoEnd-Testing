package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	
	By shopmen=By.xpath("//span[contains(text(),'SHOP MEN')]");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getMenPage()
	{
		return driver.findElement(shopmen);
	}
		
    }
