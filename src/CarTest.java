import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car c=new Car(200);
		assertEquals(200,c.getEngineCapacity());
	}

}
