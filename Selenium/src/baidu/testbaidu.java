package baidu;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testbaidu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("C:\\Program Files (x86)\\Google\\Chrome\\Application");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		driver = new RemoteWebDriver(new URL("http://192.168.42.55:5555/wd/hub"),capabilities);
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();

	}

}
