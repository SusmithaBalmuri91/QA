package SeleniumJava.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//parent::p[@class='visible-sm-block']//a[contains(text(),'Signup for Opencart Cloud')]")).click();
	String title = driver.getTitle();
	System.out.println(title);
}}
