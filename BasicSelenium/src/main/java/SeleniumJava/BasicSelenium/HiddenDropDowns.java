package SeleniumJava.BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDropDowns {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'button')]")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		List<WebElement> li =driver.findElements(By.xpath("//div[@role='listbox']//span"));
		for(WebElement options:li)
		{
			String value=options.getText();
			System.out.println(value);
			if(value.contains("Full"))
			{
				options.click();
			}}*/
			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement radio = driver.findElement(By.xpath("//select[@id='colors']"));
			Select select = new Select(radio);
		List<WebElement> li1 =select.getOptions();
		for(WebElement option : li1)
		{
			String result =option.getText();
			System.out.println(result);
			if(result.equals("Blue") || result.equals("Green"))
			{
				System.out.println("Enytefrstdsg");
				option.click();
			}
		}
			
		}
	}


