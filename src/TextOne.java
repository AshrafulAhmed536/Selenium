import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> totalTextBoxes = objDriver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(totalTextBoxes.size());
		for(WebElement x : totalTextBoxes)
			System.out.println(x.getAttribute("placeholder"));
	}

}
