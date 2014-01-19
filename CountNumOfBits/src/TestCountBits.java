import static org.junit.Assert.*;

import org.junit.Test;


public class TestCountBits {
	CountBits test = new CountBits();


	@Test
	public void test() {
		assertEquals(test.numBits(7), 3);
		assertEquals(test.numBits(27), 4);
	}

}
