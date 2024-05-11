package superkey;

public class Childconstructor extends Parentconstructor {
	public Childconstructor()
	{
		
		super("adb");
		System.out.println("Bala");
		//super.Parentconstructor();
	}

	public static void main(String[] args) {
		
		Childconstructor obj=new Childconstructor();
		
	}

}
