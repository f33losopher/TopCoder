import org.junit.Test;


public class TestComparator {
	PriQueue pq = new PriQueue();
	
	@Test
	public void test() {
		pq.addObj(new Person(37, 100));
		pq.addObj(new Person(45, 100));
		pq.addObj(new Person(45, 90));
		pq.addObj(new Person(37, 5));
		pq.addObj(new Person(55, 101));
		pq.addObj(new Person(100, 20));
		pq.addObj(new Person(55, 200));
		pq.addObj(new Person(20, 5));
		pq.addObj(new Person(45, 95));
		pq.addObj(new Person(55, 200));
		
		System.out.println(pq);
	}

}
