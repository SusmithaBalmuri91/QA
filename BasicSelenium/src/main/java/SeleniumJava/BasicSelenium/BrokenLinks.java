package SeleniumJava.BasicSelenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement liks : links)
		{
			String urlelement =liks.getAttribute("href");
			if(urlelement==null || urlelement.equals(""))
			{
				System.out.println("Not possible");
				continue;
			}
			try {
				URL url = new URL(urlelement);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400)
				{
					System.out.println(urlelement+"------>>>>Broken link");
				}
				else
				{
					System.out.println("not Broken link");
				}
			} 
			catch (Exception e) {
			
			}
		}
	}

}
