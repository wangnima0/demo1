import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/学习/软件测试基础/selenium/dialogs.html";
		driver.get(url);
		driver.findElement(By.id("prompt")).click();;
		Thread.sleep(3000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("这是个Prompt");
		Thread.sleep(2000);
		prompt.accept();
		
	}

}
