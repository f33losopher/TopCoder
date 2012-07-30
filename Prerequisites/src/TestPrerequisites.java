import junit.framework.TestCase;
import org.junit.Test;

public class TestPrerequisites extends TestCase {
	Prerequisites _prereq;
	
	public void setUp() throws Exception {
		super.setUp();
		_prereq = new Prerequisites();
	}
	
	@Test
	public void testObject() {
		assertNotNull("Prerequisites exists", _prereq);
	}
	
	@Test
	public void testParseSchedule() {
		assertEquals(true, _prereq.parseSchedule("CSE111: CSE110 MATH101"));
		assertEquals(true, _prereq.parseSchedule("CSE110:"));
		
		assertEquals(false, _prereq.parseSchedule("CS117:"));
		assertEquals(false, _prereq.parseSchedule("cs117:"));
		assertEquals(false, _prereq.parseSchedule("CS9E11:"));
		assertEquals(false, _prereq.parseSchedule("CSE110: "));
		assertEquals(false, _prereq.parseSchedule("CSE110: CSE101 "));
		assertEquals(false, _prereq.parseSchedule("MATH211: MAM2222"));
		assertEquals(false, _prereq.parseSchedule("MATH211: MAM22"));
		assertEquals(false, _prereq.parseSchedule("ENGIN517: MATH211"));
		
		assertEquals(true, _prereq.parseSchedule("CSE121: CSE110"));
		assertEquals(true, _prereq.parseSchedule("CSE110:"));
		assertEquals(true, _prereq.parseSchedule("MATH122:"));
		
		
		
//		assertEquals(3, _prereq._classes.size());
	}
	
	
}
