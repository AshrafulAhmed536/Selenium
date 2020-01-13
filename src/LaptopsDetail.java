import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaptopsDetail {

	public static void main(String[] args) {
		String var3 = "Your Store";
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com");
		String var1 = objDriver.getTitle();
		if(var1.equalsIgnoreCase(var3))
			System.out.println("The Home page is opened");
		else System.out.println("The home page is not opened");
		WebElement obj1 = objDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/a"));
		obj1.click();
		WebElement obj2 = objDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		obj2.click();
		var1 = objDriver.getTitle();
		System.out.println("Title of page is "+var1.toUpperCase());
		WebElement obj3 = objDriver.findElement(By.id("input-limit"));
		Select s1 = new Select(obj3);
		List<WebElement> sl = s1.getOptions();
		System.out.println("min value="+sl.get(0).getText());
		System.out.println("max value="+sl.get(sl.size()-1).getText());
		for(WebElement x : sl)
			System.out.println(x.getText());

	}

}
