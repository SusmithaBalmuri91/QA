package SeleniumJava.BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
List<WebElement> list =driver.findElements(By.xpath("//li//a[@href='#']"));
for(int i=1;i<=list.size();i++)
{
	if(i>1) {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()="+i+"]")).click();
}}
	}

}
