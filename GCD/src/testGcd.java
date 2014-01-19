import static org.junit.Assert.*;

import org.junit.Test;


public class testGcd {
	GCD gcd = new GCD();

	@Test
	public void test() {
		assertEquals(gcd.gcd(2336, 1314), 146);
		assertEquals(gcd.gcd(1314, 2336), 146);
		
		assertEquals(gcd.otherGcd(2336, 1314), 146);
		assertEquals(gcd.otherGcd(1314, 2336), 146);
	}
	
}
