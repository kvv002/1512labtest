import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest2 {

	@Test
	public void test() {
		Car c=new Car(200);
		assertEquals(400,c.getEngineCapacity());
	}

}
