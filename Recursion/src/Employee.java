import java.util.ArrayList;
import java.util.List;


public class Employee {
	private Employee myBoss = null;
	private List<Employee> myWorkers = new ArrayList<Employee>();
	private String myName = "";
	
	public Employee (String name) {
		myName = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (myName.equals(((Employee) o).getName())) {
			return true;
		}
		return false;
	}
	
	public void addBoss(Employee boss) {
		myBoss = boss;
	}
	
	public void addWorker(Employee worker) { 
		myWorkers.add(worker);
	}
	
	public String getName() {
		return myName;
	}
	
	public List<Employee> getEmployees() {
		return myWorkers;
	}
}
