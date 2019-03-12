import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ahead03_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://localhost:8080/examsys/";
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming1");
		Thread.sleep(3000);
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("usertype"));
		Select select = new Select(element);
		select.selectByIndex(2);
		Thread.sleep(8000);
		driver.findElement(By.className("tm_btn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String a=alert.getText();
		System.out.println(a);
		alert.accept();
		driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("hujianming");
		Thread.sleep(3000);
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.name("usertype"));
		Select select1 = new Select(element1);
		select1.selectByIndex(2);
		Thread.sleep(8000);
		driver.findElement(By.className("tm_btn")).click();
		driver.switchTo().frame("menu");
		Boolean bl = driver.findElement(By.linkText("学生管理")).isDisplayed();
		if(bl.equals(true))
		{
			System.out.println("登录成功");
		}
		else
		{
			System.out.println("登录失败");
		}
		
	}

}
