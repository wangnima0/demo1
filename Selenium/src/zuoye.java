import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zuoye {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		String url="https://www.cnblogs.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"cate_item_2\"]/a"))).perform();
		driver.findElement(By.linkText("Java(5)")).click();
		driver.findElement(By.id("zzk_q")).sendKeys("java");
		driver.findElement(By.className("search_btn")).click();
		Thread.sleep(10000);
		String a=driver.findElement(By.id("CountOfResults")).getText(); 
		String b="0";
		if(a.equals(b))
		{
			File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("D:/Ñ§Ï°/Èí¼þ²âÊÔ»ù´¡/selenium/test.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(a);
		}	
		driver.navigate().back();
		String c=driver.findElement(By.className("titlelnk")).getText();
		System.out.println(c);
		
	}

}
