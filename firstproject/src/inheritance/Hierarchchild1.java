package inheritance;

public class Hierarchchild1 extends Hierarchparent {

	public void hierarch1()
	{
		System.out.println("this is child1");
		
	}
	public static void main(String[] args) {
		Hierarchchild1 obj=new Hierarchchild1();
		obj.hierarch1();
		obj.parent3();

	}

}
