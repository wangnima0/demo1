import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		String url="https://www.v2ex.com/";//V2EX��ַ
		WebDriver driver=new ChromeDriver();//��Chrome�����
		driver.get(url);//��V2EX��ҳ
		//WebElement a=driver.findElement(By.id("kw"));
		//��������������selenium  a.sendKeys("selenium");
		//WebElement b=driver.findElement(By.id("su"));
		//����ٶ�һ��  b.click();
		//WebElement c=driver.findElement(By.linkText("����"));
		//�������  c.click();
		//driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");
		//��V2EX��ҳ�������  List<WebElement> elements = driver.findElements(By.className("tab"));
		//elements.get(4).click();
		//for(int i=0;i<10;i++)
		//{
		//	System.out.println(elements.get(i));
		//}
		List<WebElement> elements = driver.findElements(By.className("top"));
		String a=elements.get(0).getText();
		System.out.println(a);
		List<WebElement> elements1 = driver.findElements(By.linkText("����Ա"));
		elements1.get(0).click();
		List<WebElement> elements2 = driver.findElements(By.className("page_normal"));
		elements2.get(3).click();
		List<WebElement> elements3 = driver.findElements(By.className("count_livid"));
		String b=elements3.get(1).getText();
		System.out.println(b);
		
	}

}
