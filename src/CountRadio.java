import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountRadio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> objl = objDriver.findElements(By.name("radiooptions"));
		objl.get(0).click();
		System.out.println("Male is displayed  "+objl.get(0).isDisplayed());
		System.out.println("Female is displayed  "+objl.get(1).isDisplayed());
		System.out.println("Male is slected  "+objl.get(0).isSelected());
		System.out.println("Female is selected  "+objl.get(1).isSelected());
		
		WebElement ch1 = objDriver.findElement(By.id("checkbox1"));
		WebElement ch2 = objDriver.findElement(By.id("checkbox2"));
		WebElement ch3 = objDriver.findElement(By.id("checkbox3"));
		ch1.click();
		System.out.println(ch1.isDisplayed());
		System.out.println(ch2.isSelected());
		
		WebElement s1 = objDriver.findElement(By.id("Skills"));
		System.out.println("Skills is displayed " +s1.isDisplayed());
		Select s2 = new Select(s1);
		s2.selectByValue("Android");
		
			
	
	}
}
