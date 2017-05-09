import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {
int val1=100;
	@Test
	public void test() {
		Car c=new Car(200);
		assertTrue (val1 < c.getEngineCapacity());
	}

}
