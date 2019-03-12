import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.baidu.com/";
		driver.get(url);
		WebElement a=driver.findElement(By.linkText("µÇÂ¼"));
		if(a.isDisplayed())
		{
			System.out.println("Î´µÇÂ¼£¬ÇëÏÈµÇÂ¼");
			a.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
			driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("18296446797");
			Thread.sleep(3000);
			driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("wzx123456");
			Thread.sleep(3000);
			driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
			Set<Cookie> c=driver.manage().getCookies();
			for(Cookie b:c)
			{
				System.out.println(b.getName());
				System.out.println(b.getValue());
			}
			System.out.println("µÇÂ¼³É¹¦");
		}
		else
		{
			System.out.println("ÒÑµÇÂ¼");
			Set<Cookie> c=driver.manage().getCookies();
			for(Cookie b:c)
			{
				System.out.println(b.getName());
				System.out.println(b.getValue());
			}
			
		}

	}

}
