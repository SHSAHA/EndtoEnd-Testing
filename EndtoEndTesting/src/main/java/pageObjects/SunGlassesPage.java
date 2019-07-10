package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SunGlassesPage {

public WebDriver driver;
	
    By addbag=By.xpath("//span[contains(text(),'Add to bag')]");
	
	public SunGlassesPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement addtoBag()
	{
		return driver.findElement(addbag);
	}	
	
    }
