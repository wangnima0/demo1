import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class zuoye12_25Test {
	
	static zuoye12_25 a=new zuoye12_25();

	@BeforeClass
	public static void setUp() throws Exception {
		
		a.open();
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void testTianxie() {
		
		a.login();
		a.tianxie();
		String b=a.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/div")).getText();
		//System.out.println(b);
		assertEquals("test",b);
		System.out.println("添加成功"+"\n姓名:"+b);
	}
	@Test
	public void testTianxie1() {
		
		String c=a.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[4]/div")).getText();
		//System.out.println(c);
		assertEquals("123",c);
		System.out.println("学号:"+c);
	}

}
