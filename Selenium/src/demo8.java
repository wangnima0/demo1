import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/学习/软件测试基础/selenium/表单.html";
		driver.get(url);
		WebElement d =driver.findElement(By.name("yue"));
		Select s=new Select(d);
		s.selectByIndex(3);

	}

}
