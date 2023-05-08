
public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		this("anonymous", 21);
		
	}
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void print()
	{
		System.out.println("Name "+name+" age:"+age);
	}
	public static void main(String args[]) {
		Person p1=new Person();
		p1.print();
		Person p2=new Person();
		p2.print();
	}
}
