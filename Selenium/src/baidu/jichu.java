package baidu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jichu {
	
	public static WebDriver driver;
	public void open() {
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.baidu.com");

	}

}
