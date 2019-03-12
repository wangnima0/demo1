import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12_17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/学习/软件测试基础/selenium/pop.html";
		driver.get(url);
		String s=driver.getWindowHandle();
		driver.findElement(By.id("goo")).click();
		Set<String> w=driver.getWindowHandles();//把所有窗口的句柄赋值给w集合
		//String url1="https://www.baidu.com/";
		for(String h:w)//增强for循环
		{
			if(h.equals(s))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(h);
				Thread.sleep(3000);
				driver.findElement(By.id("kw")).sendKeys("selenium");
				driver.findElement(By.id("su")).click();
				break;
			}
		}

	}

}
