import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class zhouce0108Test {
	
	static zhouce0108 a=new zhouce0108();

	@BeforeClass
	public static void setUp() throws Exception {
		
		a.open();
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void testLogin() throws InterruptedException, IOException {
		
		a.login();
	}

	@Test
	public void testLogin1() throws InterruptedException, IOException {
		
		a.login1();
	}

	@Test
	public void testLogin2() throws InterruptedException {
		
		a.login2();
	}

}
