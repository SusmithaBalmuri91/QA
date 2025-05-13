package SeleniumJava.BasicSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tables {
public static void main(String args[])
{
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement departure=driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select departures = new Select(departure);
	departures.selectByVisibleText("Paris");
	WebElement destination=driver.findElement(By.xpath("//select[@name='toPort']"));
	Select destinations = new Select(destination);
	destinations.selectByIndex(2);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
	ArrayList<String> s2= new ArrayList<String>();
	for(int r=1;r<rows.size();r++)
	{
		String s1=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
		s2.add(s1);
	   }
	 System.out.println(s2);
	 Collections.sort(s2);
	 System.out.println(s2);
	  System.out.println(s2.get(0));
	  String lowestvalue = s2.get(0);
		for(int r=1;r<rows.size();r++)
		{
			String s4=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
			if(s4.equals(lowestvalue))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]//input")).click();	
			break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='First Last']")).sendKeys("Susmitha");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		boolean h1 =driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).isDisplayed();
		System.out.println(h1);
		/*List<WebElement> values = departures.getOptions();
	for(WebElement value:values)
	{
		
		System.out.println(value.getText());
		if(value.getText().equals("Boston"))
		{
			System.out.println("value");
			departures.selectByVisibleText(value.getText());	
		}
	}
	*/
}
}
