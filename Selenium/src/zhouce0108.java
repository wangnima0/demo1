import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zhouce0108 {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		
//		zhouce0108 zc=new zhouce0108();
//		zc.open();
//		zc.login();

	}
	
	public void open() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="https://www.baidu.com/";
		driver.get(url);
		
	}
	
	public void login() throws InterruptedException, IOException
	{
		
		driver.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("17679277551");
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("123456");
		Thread.sleep(10000);
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		Thread.sleep(3000);
		String a=driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();
		System.out.println(a);
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("F:/test.png"));
		driver.findElement(By.id("TANGRAM__PSP_4__closeBtn")).click();
	}
	
	public void login1() throws InterruptedException, IOException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("1767927755");
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("ly123456");
		Thread.sleep(10000);
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		Thread.sleep(3000);
		String a=driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();
		System.out.println(a);
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("F:/test1.png"));
		driver.findElement(By.id("TANGRAM__PSP_4__closeBtn")).click();
	}
	
	public void login2() throws InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("17679277551");
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("ly123456");
		Thread.sleep(10000);
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		Thread.sleep(15000);
		String a=driver.findElement(By.xpath("//*[@id=\"s_username_top\"]/span")).getText();
		System.out.println(a+"ÓÃ»§µÇÂ¼³É¹¦");
	}

}
