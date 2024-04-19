package inheritance;

public class Hierarchchild2 extends Hierarchchild1 {
public void child2()
{
System.out.println("this is child 2");
}
	public static void main(String[] args) {
		Hierarchchild2 obj1=new Hierarchchild2();
		obj1.child2();
		obj1.parent3();

	}

}
