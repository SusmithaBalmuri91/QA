package SeleniumJava.BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
	WebDriver driver;
	driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	WebElement action =driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
	WebElement laptops=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
	Actions mouseover = new Actions(driver);
	mouseover.moveToElement(action).moveToElement(laptops).click().perform();
WebElement input1 = driver.findElement(By.xpath("//input[@id='field1']"));
input1.clear();
input1.sendKeys("Welcome to selenium");
WebElement doubleclick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	mouseover.doubleClick(doubleclick).perform();
	String input2=driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
	if(input2.equals("Welcome to selenium"))
	{
		System.out.println("Entered");
	}
	WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	WebElement destination=driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
	Action act =mouseover.dragAndDrop(source, destination).build();
	act.perform();
	}

}
