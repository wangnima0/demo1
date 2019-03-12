package ahead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ahead03_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/examsys/");
		driver.findElement(By.name("username")).sendKeys("hujianming");
		//Thread.sleep(3000);
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		//Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("usertype"));
		Select select = new Select(element);
		select.selectByIndex(2);
		Thread.sleep(8000);
		driver.findElement(By.className("tm_btn")).click();
		driver.switchTo().frame("menu");
		driver.findElement(By.linkText("数据分析")).click();
		driver.findElement(By.linkText("考试分析")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("//*[@id=\"tm_data_body\"]/tr[1]/td/a/img")).click();

	}

}
