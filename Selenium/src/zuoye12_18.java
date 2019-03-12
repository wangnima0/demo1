import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye12_18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://login.taobao.com/";
		driver.get(url);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"J_QRCodeLogin\"]/div[5]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"TPL_username_1\"]")).sendKeys("123456");
		WebElement a=driver.findElement(By.xpath("//*[@id=\"nc_1_n1z\"]"));
		Thread.sleep(3000);
		(new Actions(driver)).dragAndDropBy(a, 258,0).perform();
		
	}

}
