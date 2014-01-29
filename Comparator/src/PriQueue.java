import java.util.PriorityQueue;

public class PriQueue {
	PriorityQueue<Person> myPq = new PriorityQueue<Person>(5, new PersonComparer());
	
	public PriQueue() {
		
	}
	
	public void addObj(Person obj) {
		myPq.add(obj);
	}
	
	@Override
	public String toString() {
		String print = "";
		Person p;
		while (!myPq.isEmpty()) {
			p = myPq.poll();
			print += "Height: " + p.getHeight() + " Weight: " + p.getWeight() + "\n";
		}
		return print;
	}
}
