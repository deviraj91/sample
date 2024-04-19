package inheritance;

public class Singleinherchild extends Singleinher {

	public void child1()
	{
		System.out.println("this is child method");
	
	}
	public static void main(String[] args) {
	Singleinherchild obj = new Singleinherchild();
	obj.child1();
    obj.parent1();
	}

}
