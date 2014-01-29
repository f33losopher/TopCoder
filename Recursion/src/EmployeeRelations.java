
public class EmployeeRelations {
	public EmployeeRelations() {
		
	}
	
	public int countEmployeesUnder(Employee employee) {
		System.out.println("Employee: " + employee.getName());
		
		int numEmployee = 0;
		if (employee.getEmployees().size() == 0) return 0;
		
		for (Employee e: employee.getEmployees()) {
			numEmployee++;
			numEmployee += countEmployeesUnder(e);
		}
		return numEmployee;
	}
}
