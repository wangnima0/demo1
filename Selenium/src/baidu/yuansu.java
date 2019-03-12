package baidu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class yuansu extends jichu{
	
	public static WebElement a;
	public void yuansu() {
		
		a = driver.findElement(By.linkText("пбне"));
		
	}

}
