import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/学习/软件测试基础/selenium/frame.html";
		driver.get(url);
		//转向iframe
		driver.switchTo().frame("frame");
		driver.findElement(By.id("input1")).sendKeys("aaa");
		driver.switchTo().defaultContent();//跳转至默认框架
		
	}

}
