import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		String url="https://mail.163.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}

}
