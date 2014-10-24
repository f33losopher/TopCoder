import static org.junit.Assert.*;

import org.junit.Test;


public class TestCountBits {
	CountBits test = new CountBits();


	@Test
	public void test() {
		assertEquals(3, test.numBits(7));
		assertEquals(4, test.numBits(27));
		
		assertEquals(1, test.nextBiggerNumWithSameBits(0));
		assertEquals(4, test.nextBiggerNumWithSameBits(2));
		assertEquals(5, test.nextBiggerNumWithSameBits(3));
		assertEquals(81, test.nextBiggerNumWithSameBits(76));
		assertEquals(99, test.nextBiggerNumWithSameBits(92));
		assertEquals(11, test.nextBiggerNumWithSameBits(7));
		assertEquals(207, test.nextBiggerNumWithSameBits(190));
		assertEquals(9, test.nextBiggerNumWithSameBits(6));
		
		assertEquals(1, test.anotherNextBigNumSameBits(0));
		assertEquals(4, test.anotherNextBigNumSameBits(2));
		assertEquals(5, test.anotherNextBigNumSameBits(3));
		assertEquals(81, test.anotherNextBigNumSameBits(76));
		assertEquals(99, test.anotherNextBigNumSameBits(92));
		assertEquals(11, test.anotherNextBigNumSameBits(7));
		assertEquals(207, test.anotherNextBigNumSameBits(190));
		assertEquals(9, test.anotherNextBigNumSameBits(6));
		
		test.nextSmallNumSameBits(6);
	}
	
	@Test
	public void testPow2() {
		assertEquals(true, test.powerOf2(8));
		assertEquals(true, test.powerOf2(256));
		assertEquals(true, test.powerOf2(16));
		assertEquals(false, test.powerOf2(20));
	}

}
