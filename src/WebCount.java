import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com");
		WebElement obj1 = objDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/a"));
		obj1.click();
		WebElement obj2 = objDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		obj2.click();
		System.out.println("FOR ALL LAPTOPS");
		List<WebElement> links = objDriver.findElements(By.tagName("a"));
		System.out.println("Number of links "+links.size());
		for(WebElement ele:links)
			System.out.println(ele.getAttribute("href"));
		WebElement obj3 = objDriver.findElement(By.xpath("/html/body/div[2]/div/aside/div[1]/a[6]"));
		obj3.click();
		System.out.println("FOR TABLETS");
		List<WebElement> links2 = objDriver.findElements(By.tagName("a"));
		System.out.println("Number of links "+links2.size());
		for(WebElement ele:links2)
			System.out.println(ele.getAttribute("href"));
		
	}

}
