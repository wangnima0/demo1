import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="D:/ѧϰ/������Ի���/selenium/dialogs.html";
		driver.get(url);//������ַ
		driver.findElement(By.id("confirm")).click();//���confirm��ť
		Thread.sleep(3000);//�ȴ�3��
		Alert alert = driver.switchTo().alert();//ת�򵯿����
		alert.accept();//���ȷ��
		//���ȡ��  alert.dismiss();

	}

}
