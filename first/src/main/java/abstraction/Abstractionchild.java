package abstraction;

public class Abstractionchild extends Abstractioneg {

	public static void main(String[] args) {
		Abstractionchild obj=new Abstractionchild();
		obj.display();
		obj.display2();

	}

	@Override
	public void display2() {
		System.out.println("Abstract method");
		
	}

}
