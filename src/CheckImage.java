import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckImage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
		//WebElement obj1 = objDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/a/img"));
		//obj1.click();
		
		WebDriverWait wait =new WebDriverWait(objDriver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header1']")));
		if(element.isDisplayed())
			System.out.println("===WebDriver is Visible===");
		else
			System.out.println("===WebDriver is not visible===");
	}
}
