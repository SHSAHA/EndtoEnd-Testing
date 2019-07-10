package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SnapBackPage {
public WebDriver driver;
	
    By addtobag=By.xpath("//span[contains(text(),'Add to bag')]");
	
	public SnapBackPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement addtoBag()
	{
		return driver.findElement(addtobag);
	}	

	
    }


