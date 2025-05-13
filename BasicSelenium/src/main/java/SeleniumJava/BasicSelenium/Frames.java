package SeleniumJava.BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String args[])
{
	WebDriver driver;
	driver=new ChromeDriver();
	driver.navigate().to("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	driver.switchTo().frame(frame5);
	driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
System.out.println(driver.getCurrentUrl());
	
}
}
