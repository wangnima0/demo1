import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class baidu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.baidu.com/";
		driver.get(url);
		WebElement element=driver.findElement(By.id("su"));
		Actions builder=new Actions(driver);
		builder.contextClick(element).perform();
		builder.doubleClick(element).perform();
	}

}
