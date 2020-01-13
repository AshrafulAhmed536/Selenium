import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement obj1 = objDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select s1 = new Select(obj1);
		List<WebElement> s1l = s1.getOptions();
		for(WebElement x : s1l)
			System.out.println(x.getText());
		
		
		WebElement obj2 = objDriver.findElement(By.xpath("//*[@id=\"countries\"]"));
		Select s2 = new Select(obj2);
		List<WebElement> s2l = s2.getOptions();
		for(WebElement x : s2l)
			System.out.println(x.getText());
		
		
	}
}
