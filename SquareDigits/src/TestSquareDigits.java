import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;


public class TestSquareDigits extends TestCase {
	SquareDigits _sq;
	
	public void setUp() throws Exception {
		super.setUp();
		_sq = new SquareDigits();
	}
	
	@Test
	public void testS() {
		assertEquals("37 => 58", 58, _sq.S(37));
		assertEquals("58 => 89", 89, _sq.S(58));
		assertEquals("89 => 145", 145, _sq.S(89));
		assertEquals("145 => 42", 42, _sq.S(145));
		assertEquals("42 => 20", 20, _sq.S(42));
		assertEquals("20 => 4", 4, _sq.S(20));
		assertEquals("4 => 16", 16, _sq.S(4));
		assertEquals("16 => 37", 37, _sq.S(16));
	}
	
	@Test
	public void testT() {
		List<Integer> test = new ArrayList<Integer>();
		
		_sq.T(37);
		test.add(58);
		test.add(89);
		test.add(145);
		test.add(42);
		test.add(20);
		test.add(4);
		test.add(16);
		test.add(37);
		assertEquals("37 => 58 89 145 42 20 4 16 37", test, _sq.getSquaredDigits());
		
		test.clear();
		_sq.T(7);
		test.add(49);
		test.add(97);
		test.add(130);
		test.add(10);
		test.add(1);
		assertEquals("7 => 49 97 130 10 1", test, _sq.getSquaredDigits());
	}
	
	@Test
	public void testSmallestResult() {
		assertEquals("0 => 0", 0, _sq.smallestResult(0));
		assertEquals("2 => 11", 11, _sq.smallestResult(2));
		assertEquals("10 => 7", 7, _sq.smallestResult(10));
		assertEquals("1 => 1", 1, _sq.smallestResult(1));
		assertEquals("19 => 133", 133, _sq.smallestResult(19));
		assertEquals("85 => 5", 5, _sq.smallestResult(85));
		assertEquals("112 => 2666", 2666, _sq.smallestResult(112));
	}
}
