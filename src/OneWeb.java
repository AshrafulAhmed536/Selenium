import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class OneWeb {
	public static void main(String[] args) {
		String uname = null;
		String pwd = null;
		Scanner s =new Scanner(System.in);
		uname = s.next();
		pwd = s.next();
		String var3 = "Your Store";
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com");
		System.out.println("Open cart page Loaded");
		String var1 = objDriver.getTitle();
		if(var1.equalsIgnoreCase(var3))
			System.out.println("The browser contains this element");
		else System.out.println("The searched element is not present");
		System.out.println("Title of the page "+var1);
		WebElement obj1 = objDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		obj1.click();
		
		WebElement obj2 = objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		obj2.click();
		WebElement obj3 = objDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		obj3.sendKeys(uname);
		WebElement obj4 = objDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		obj4.sendKeys(pwd);
		WebElement obj5 =objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/input"));
		obj5.click();
	}

}
