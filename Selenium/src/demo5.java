import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/学习/软件测试基础/selenium/dialogs.html";
		driver.get(url);//输入网址
		driver.findElement(By.id("confirm")).click();//点击confirm按钮
		Thread.sleep(3000);//等待3秒
		Alert alert = driver.switchTo().alert();//转向弹框对象
		alert.accept();//点击确定
		//点击取消  alert.dismiss();

	}

}
