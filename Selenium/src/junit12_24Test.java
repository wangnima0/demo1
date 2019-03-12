import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junit12_24Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		int a=junit12_24.div(4, 2);
		assertEquals(2, a);
	}

}
