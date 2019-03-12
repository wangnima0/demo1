import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tuola {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/Ñ§Ï°/Èí¼þ²âÊÔ»ù´¡/selenium/selenium_html/dragAndDrop.html";
		driver.get(url);
		WebElement element=driver.findElement(By.id("drag"));
		//WebElement b=driver.findElement(By.xpath("/html/body/h1"));
		Thread.sleep(3000);
		(new Actions(driver)).dragAndDropBy(element, -185,-25).perform();

	}

}
