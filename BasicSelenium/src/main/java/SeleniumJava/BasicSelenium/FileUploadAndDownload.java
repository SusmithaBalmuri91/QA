package SeleniumJava.BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAndDownload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		String f1= "C:\\Users\\susmi\\Desktop\\Selenium Notes";
		String f2="C:\\APITesting";
	WebElement upload =	driver.findElement(By.xpath("//input[@id='filesToUpload']"));
	
	upload.sendKeys(f1+"\n"+f2);
	int size = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	System.out.println(size);
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()","");
	//js.executeScript("arguments[0].setAttribute('value','C:\\\\\\\\APITesting')", upload);
		

	}

}
