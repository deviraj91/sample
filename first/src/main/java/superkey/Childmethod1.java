package superkey;

public class Childmethod1 extends Parentmethod {
public void display()
{
	System.out.println("Hello");
	super.display();
}
	public static void main(String[] args) {
		
		Childmethod1 obj=new Childmethod1();
		obj.display();
		
	}

}
