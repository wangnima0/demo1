import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		String url="https://www.baidu.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//打开百度网页  driver.get("https://www.baidu.com/");
		//打开百度网页  driver.navigate().to("https://www.baidu.com/");
		//浏览器后退  driver.navigate().back();
		//浏览器前进  driver.navigate().forward();
		//浏览器刷新  driver.navigate().refresh();
		//浏览器最大化  driver.manage().window().maximize();
		Dimension dimension = new Dimension(900, 800);//设置浏览器大小
		driver.manage().window().setSize(dimension);
		//获取当前页面URL  driver.getCurrentUrl();
		//获取当前页面Title  driver.getTitle();
		
	}

}
