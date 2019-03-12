import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		String url="https://www.v2ex.com/";//V2EX网址
		WebDriver driver=new ChromeDriver();//打开Chrome浏览器
		driver.get(url);//打开V2EX网页
		//WebElement a=driver.findElement(By.id("kw"));
		//在搜索框内输入selenium  a.sendKeys("selenium");
		//WebElement b=driver.findElement(By.id("su"));
		//点击百度一下  b.click();
		//WebElement c=driver.findElement(By.linkText("新闻"));
		//点击新闻  c.click();
		//driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");
		//在V2EX网页点击交易  List<WebElement> elements = driver.findElements(By.className("tab"));
		//elements.get(4).click();
		//for(int i=0;i<10;i++)
		//{
		//	System.out.println(elements.get(i));
		//}
		List<WebElement> elements = driver.findElements(By.className("top"));
		String a=elements.get(0).getText();
		System.out.println(a);
		List<WebElement> elements1 = driver.findElements(By.linkText("程序员"));
		elements1.get(0).click();
		List<WebElement> elements2 = driver.findElements(By.className("page_normal"));
		elements2.get(3).click();
		List<WebElement> elements3 = driver.findElements(By.className("count_livid"));
		String b=elements3.get(1).getText();
		System.out.println(b);
		
	}

}
