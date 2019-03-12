import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class zuoye12_24Test {
	
	static zuoye12_24 a=new zuoye12_24();

	@BeforeClass
	public static void setUp() throws Exception {
		
		a.open();
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		
		a.login();
		String b=a.driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/div/span/font/strong")).getText();
		assertEquals("欢迎光临在线考试系统",b);
		System.out.println("登录成功");
	}
	@Test
	public void testLogin1() {
		
		String c=a.driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/p/span/font")).getText();
		assertEquals("test",c);
		System.out.println(c+"同学");
	}

}
