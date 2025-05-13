package SeleniumJava.BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
		Select option = new Select(element);
		option.selectByVisibleText("Brazil");
		List<WebElement> options = option.getOptions();
		System.out.println(options.size());
		for(WebElement optionsDrop : options)
		{
			String value=optionsDrop.getText();
			System.out.println(value);
			
			if(value.equals("India"))
			{
				optionsDrop.click();
				System.out.println("ydrabd");
			}
		}
		
	}

}
