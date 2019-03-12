import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://flight.qunar.com/";
		driver.get(url);
		//选择单程
		driver.findElement(By.xpath("//*[@id=\"searchTypeSng\"]")).click();
		//输入出发、到达城市
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input")).sendKeys("宁都");
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/input")).sendKeys("南昌");
		//选择today+7日后的日期
		

	}

}
