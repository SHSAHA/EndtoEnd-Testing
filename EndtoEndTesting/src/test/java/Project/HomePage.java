package Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import pageObjects.SigninPage;
import pageObjects.SignupPage;
import pageObjects.MenPage;
import pageObjects.MyBagPage;
import pageObjects.SnapBackPage;
import pageObjects.SunGlassesPage;
import pageObjects.TrendPage;
import Resources.base;

public class HomePage extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Email, String FirstName, String LastName, String ContactNumber, String Address, String City, String County, String PostCode) throws IOException
	{
		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		log.info("Driver is Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to LandingPage");
		
		LandingPage l=new LandingPage(driver);
		l.getMenPage().click(); //driver.findElement(By.xpath())
		
		MenPage m=new MenPage(driver);
		m.getTrendPage().click(); //driver.findElement(By.xpath())
		
		TrendPage t=new TrendPage(driver);
		t.getSunGlassesPage().click(); //driver.findElement(By.xpath())
		
		SunGlassesPage s=new SunGlassesPage(driver);
		s.addtoBag().click(); //driver.findElement(By.xpath())
		
		driver.navigate().back();
		
		t.getSnapBackPage().click(); //driver.findElement(By.xpath())
		
		SnapBackPage sb=new SnapBackPage(driver);
		sb.addtoBag().click(); //driver.findElement(By.xpath())
		
		MyBagPage b=new MyBagPage(driver);
		b.getCheckOutPage().click(); //driver.findElement(By.linkText())
		
		SigninPage lp=new SigninPage(driver);
		lp.getNewToAsos().click(); //driver.findElement(By.xpath())
		
		SignupPage su=new SignupPage(driver);
		su.getContinueToCheckOut().click(); //driver.findElement(By.cssSelector())
		
		log.info("Successfully navigated to Checkout page with 2 products");
		
		CheckOutPage co=new CheckOutPage(driver);
		co.selectCountry().click(); //driver.findElement(By.cssSelector())
		co.enterEmail().sendKeys(Email); //driver.findElement(By.cssSelector())
		co.addEmail().click(); //driver.findElement(By.cssSelector())
		co.enterFirstName().sendKeys(FirstName); //driver.findElement(By.cssSelector())
		co.enterLastName().sendKeys(LastName); //driver.findElement(By.cssSelector())
		co.enterMobile().sendKeys(ContactNumber); //driver.findElement(By.cssSelector())
		co.enterAddress().sendKeys( Address); //driver.findElement(By.cssSelector())
		co.enterCity().sendKeys(City); //driver.findElement(By.cssSelector())
		co.enterCounty().sendKeys(County); //driver.findElement(By.cssSelector())
		co.enterPostCode().sendKeys(PostCode); //driver.findElement(By.cssSelector())
		co.addDetails().click(); //driver.findElement(By.xpath())

		log.info("Details added successfully");
		co.selectDeliveryOption().click(); //driver.findElement(By.xpath())
		log.info("Selenium Test completed successfully");
		}
	

	   @AfterTest
	   public void teardown()
	   {
		  driver.close();
		  driver=null;
		
	   }
	
	@DataProvider
	public Object[][] getData()
	{	
		Object[][] data=new Object[1][8];
		
		data[0][0]="shaswatasaha@gmail.com";
		data[0][1]="Shaswata";
		data[0][2]="Saha";
		data[0][3]="56771759";
		data[0][4]="Siidisaba";
		data[0][5]="Tallinn";
		data[0][6]="Harju maakond";
		data[0][7]="11311";
		
		return data;
			
		}
	
     }
