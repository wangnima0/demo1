import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye12_25 {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zuoye12_25 a=new zuoye12_25();
		a.open();
		a.login();
		a.tianxie();

	}
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://localhost:8080/Exam_ssh";
		driver.get(url);
	}
	public void login()
	{
		driver.findElement(By.linkText("进入后台管理")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
	}
	public void tianxie()
	{
		driver.findElement(By.id("stuNumber")).sendKeys("123");
		driver.findElement(By.id("realname")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		
	}

}
