import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/ѧϰ/������Ի���/selenium/frame.html";
		driver.get(url);
		//ת��iframe
		driver.switchTo().frame("frame");
		driver.findElement(By.id("input1")).sendKeys("aaa");
		driver.switchTo().defaultContent();//��ת��Ĭ�Ͽ��
		
	}

}
