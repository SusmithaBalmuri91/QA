package SeleniumJava.BasicSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File target = ts.getScreenshotAs(OutputType.FILE);
		File source = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		target.renameTo(source);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement img =driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
		File target1 =img.getScreenshotAs(OutputType.FILE);
		File source1 = new File(System.getProperty("user.dir")+"//screenshots//Elementpage.png");
		target1.renameTo(source1);

	}

}
