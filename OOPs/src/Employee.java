
public abstract class Employee {
	private String empName;
	private int empId;
	private double salary;
	private double balance;
	
	
	
	public Employee() {
	
		
	}
	
	
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		
		
	}
	public void getSalary() {
		System.out.println("salary: "+salary);
	}


	public void paySlip() {
		System.out.println("Name: "+empName+"ID: "+empId+ "Salary: "+salary);
		
		
	}
	
	public void balance() {
		salary+=balance;
		System.out.println("salary: "+salary);
	}
	
	public void withdraw() {
		salary-=balance;
		System.out.println("salary: "+salary);
	}
	public static void main(String args[]) {
		
	}

}
