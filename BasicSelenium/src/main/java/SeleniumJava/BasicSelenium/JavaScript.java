package SeleniumJava.BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JavaScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].setAttribute('value','john')", name);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		execute.executeScript("arguments[0].setAttribute('value','susmithar03')", email);
		WebElement gender= driver.findElement(By.xpath("//input[@id='male']"));
		execute.executeScript("arguments[0].click()",gender);
		WebElement days= driver.findElement(By.xpath("//input[@id='monday']"));
		execute.executeScript("arguments[0].click()", days);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testautomationpractice.blogspot.com/");
		//execute.executeScript("window.scrollBy(0,1500)");
		//System.out.println(execute.executeScript("return.window.pageYoffset;"));
		WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Gender:']"));
		execute.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(execute.executeScript("return.window.pageYoffset; "));
		execute.executeScript("window.scrollBy(document.body.scrollHeight)","");
	}

}
