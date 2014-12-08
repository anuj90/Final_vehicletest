import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	Person a;
	@Test
	public void test() {
		assertEquals("name","Anuj");
		
		assertEquals("NumberofDoors",4);
		assertEquals("name","Anuj");
	}

	@Test
	public void test2() {
		int num = a.getPersonId();
		assertEquals(num,2222);
	}
	}
