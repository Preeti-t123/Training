
public class Alpha {

	public Alpha() {
		System.out.println("Alpha");
	}
	public void demo() {
		System.out.println("Alpha Demo");
	}
	

}
class Beta extends Alpha{
	public Beta()
	{
		System.out.println("Alpha");
	}
	public void test() {
		System.out.println("Beta Test");
	}


public static void main(String args[]) {
	Alpha a=new Alpha();
	a.demo();
	
	Beta b=new Beta();
	b.demo();
	b.test();
}
}





