import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo12_18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/Ñ§Ï°/Èí¼þ²âÊÔ»ù´¡/selenium/selenium_html/demo1.html";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("luoyong");
		Thread.sleep(3000);
		driver.findElement(By.linkText("baidu")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.name("select"));
		Select select=new Select(element);
		select.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.className("Volvo")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("checkbox1")).click();
		driver.findElement(By.name("checkbox2")).click();
		Thread.sleep(3000);
		Boolean bl=driver.findElement(By.className("button")).isEnabled();
		//System.out.println(bl);
		if(bl.equals(true))
		{
			driver.findElement(By.className("button")).click();
		}
		else
		{
			System.out.println("Submit°´Å¥ÎªÖÃ»Ò×´Ì¬");
		}
		Thread.sleep(3000);
		driver.findElement(By.className("alert")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.id("load")).sendKeys("F:/1.jpg");
		String a=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Open new window")).click();
		Set<String> b=driver.getWindowHandles();
		for(String c:b)
		{
			if(c.equals(a))
			{
				Thread.sleep(3000);
				driver.switchTo().window(a);
			}
			else
			{
				continue;
			}
			
		}
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"action\"]/input"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
		Thread.sleep(5000);
		String d=driver.findElement(By.className("red")).getText();
		System.out.println(d);
	}

}
