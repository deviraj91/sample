package inheritance;

public class Multilchild2 extends Multilchild {
	public void child2()
	{
	System.out.println("this is child method 2");	
	
	}

	public static void main(String[] args) {
		Multilchild2 obj=new Multilchild2();
		obj.child2();
		obj.child1();
		obj.parent2();
	}

}
