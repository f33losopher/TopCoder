import org.junit.Test;

import junit.framework.TestCase;

public class TestHowEasy extends TestCase {
	HowEasy _howEasy;

	public void setUp() throws Exception {
		super.setUp();
		_howEasy = new HowEasy();
	}

	@Test
	public void testIsWord() {
		assertEquals("ab is a word", true, _howEasy.isWord("ab"));
		assertEquals("ab. is a word", true, _howEasy.isWord("ab."));
		assertEquals("ab.. is NOT a word", false, _howEasy.isWord("ab.."));
		assertEquals("a.b is NOT a word", false, _howEasy.isWord("a.b"));
		assertEquals("a.b. is NOT a word", false, _howEasy.isWord("a.b."));
		assertEquals("a2b. is NOT a word", false, _howEasy.isWord("a2b."));
		assertEquals(". is NOT a word", false, _howEasy.isWord("."));
	}

	@Test
	public void testPointVal() {
		assertEquals("Should be 500", 500,
				_howEasy.pointVal("This is a problem statement"));
		assertEquals("Should be 250", 250, _howEasy.pointVal("523hi."));
		assertEquals(
				"Should be 500",
				500,
				_howEasy.pointVal("Implement a class H5 which contains some method"));
		assertEquals("Should be 250", 250, _howEasy.pointVal(" no9 . wor7ds he8re. hj.."));
		assertEquals("Should be 1000", 1000, _howEasy.pointVal("aaaaaa aaaaaa aaaaaa"));
		assertEquals("Shold be 250", 250, _howEasy.pointVal("aaa."));
	}
}
