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
		//�򿪰ٶ���ҳ  driver.get("https://www.baidu.com/");
		//�򿪰ٶ���ҳ  driver.navigate().to("https://www.baidu.com/");
		//���������  driver.navigate().back();
		//�����ǰ��  driver.navigate().forward();
		//�����ˢ��  driver.navigate().refresh();
		//��������  driver.manage().window().maximize();
		Dimension dimension = new Dimension(900, 800);//�����������С
		driver.manage().window().setSize(dimension);
		//��ȡ��ǰҳ��URL  driver.getCurrentUrl();
		//��ȡ��ǰҳ��Title  driver.getTitle();
		
	}

}
