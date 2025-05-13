package SeleniumJava.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement minslider=driver.findElement(By.xpath("//span[1]"));
		System.out.println(minslider.getLocation());
		WebElement maxslider=driver.findElement(By.xpath("//span[2]"));
		System.out.println(maxslider.getLocation());
		Actions act= new Actions(driver);
		act.dragAndDropBy(minslider, 100, 250).perform();
		System.out.println(minslider.getLocation());
		act.dragAndDropBy(maxslider, -100, 250).perform();
		System.out.println(maxslider.getLocation());
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://text-compare.com/");
		WebElement textarea= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textarea.sendKeys("Selenium");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
	}

}
