package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import common.Page_BasePage;

public class Page_GoogleHomepage extends Page_BasePage 
{
	
	@Before
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Automation/chrome driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Before
	public void openGoogleURL() 
	{
		driver.get("http://www.google.com");
	}
	@Test	
	public void checkSearchBoxIsDisplayed() 
	{
		if(driver.findElement(By.name("q")).isDisplayed()) 
		{
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}
	@Test
	public void checkGoogleSearchButtonIsDisplayed() 
	{
		if(driver.findElement(By.name("btnK")).isDisplayed()) 
		{
			System.out.println("Google Search button is displayed");
		} else 
		{
			System.out.println("Google Search button is NOT displayed");
		}
	}
	
	@Test
	public void checkImFeelingLuckyButtonIsDisplayed() 
	{
		if(driver.findElement(By.name("btnI")).isDisplayed()) 
		{
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
				
	}
	
	@Test
	public void searchOnGoogleHomepage(String keyword) 
	{
		driver.findElement(By.name("q")).sendKeys(keyword);
		driver.findElement(By.name("btnK")).click();
	}
	
	@After
	public void shutdown()
	{
		driver.close();
		
	}
}