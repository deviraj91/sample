package polymorphism;

public class ChildA extends ParentA {
	
	public void print()
	{
	System.out.println("haii");
	super.print();
	
	}
	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.print();
		
	}

}
