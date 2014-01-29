
public class TestMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.run();
	}

	public TestMain() {}
	
	public void run() {
		Employee Veronica = new Employee("Veronica");
		Employee Nathan = new Employee("Nathan");
		Employee Dilbert = new Employee("Dilbert");
		Employee Sally = new Employee("Sally");
		Employee Bob = new Employee("Bob");
		Employee Susan = new Employee("Susan");
		Employee Joseph = new Employee("Joseph");
		Employee Sam = new Employee("Sam");
		Employee Betty = new Employee("Betty");
		
		// Making the links
		Veronica.addWorker(Nathan);
		Veronica.addWorker(Sally);
		
		Nathan.addBoss(Veronica);
		Nathan.addWorker(Dilbert);
		
		Sally.addBoss(Veronica);
		Sally.addWorker(Bob);
		Sally.addWorker(Joseph);
		
		Dilbert.addBoss(Nathan);
		
		Bob.addBoss(Sally);
		Bob.addWorker(Susan);
		
		Joseph.addBoss(Sally);
		Joseph.addWorker(Sam);
		
		Susan.addBoss(Bob);
		
		Sam.addBoss(Joseph);
		Sam.addWorker(Betty);
		
		Betty.addBoss(Sam);
		
		EmployeeRelations er = new EmployeeRelations();
		System.out.println(er.countEmployeesUnder(Bob));
		
		System.out.println(er.countEmployeesUnder(Sally));
		
		System.out.println(er.countEmployeesUnder(Veronica));
	}
}
