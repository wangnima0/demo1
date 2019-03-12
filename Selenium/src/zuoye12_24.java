import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye12_24 {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://localhost:8080/Exam_ssh/login.do";
		driver.get(url);
	}
	public void login()
	{
		driver.findElement(By.name("stuNumber")).sendKeys("123");
		driver.findElement(By.name("stuName")).sendKeys("test");
		driver.findElement(By.name("B1")).click();
	}
	
}
