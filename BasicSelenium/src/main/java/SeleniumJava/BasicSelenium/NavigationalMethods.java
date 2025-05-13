package SeleniumJava.BasicSelenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationalMethods {
public static void main(String args[])
{
	WebDriver driver;
	driver= new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//explict wait
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
	
	List<WebElement> li =driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
	System.out.println(li);
	for(WebElement list:li)
	{
		list.click();
		
	}
	Set<String> wids = driver.getWindowHandles();
	for(String windowids:wids)
	{
	String url=	driver.switchTo().window(windowids).getTitle();
	System.out.println(url);
	if(url.equals("Selenium - Wikipedia"))
	{
		
		driver.close();
	}
	}
	}
}