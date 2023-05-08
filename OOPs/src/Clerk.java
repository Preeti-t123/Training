
public class Clerk extends Employee {
	private double commission;
	public Clerk() {
		
	}
	public Clerk(String name, double salary)
	{
		//super(name,salary, null);
		this.commission=commission;
	}
	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		super.getSalary() ;
	}
	@Override
	public void paySlip() {
		// TODO Auto-generated method stub
		super.paySlip();
		System.out.println("commission "+commission);
	}
	

}
