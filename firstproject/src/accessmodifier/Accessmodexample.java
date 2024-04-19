package accessmodifier;

public class Accessmodexample {
	
	public  void method1()
	{
		System.out.println("Public Access Modifier");		
	}
	private  void method2()
	{
		System.out.println("Private Access Modifier");		
	}
	protected  void method3()
	{
		System.out.println("Protected Access Modifier");		
	}
	 static void method4()
	{
		System.out.println("Default Access Modifier");		
	}
	public static void main(String[] args) {
		Accessmodexample obj=new Accessmodexample();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

}
