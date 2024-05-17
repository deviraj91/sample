package interfaceexample;

public class Multipleclassinterface implements Multipleinheritance1,Multipleinterface2 {

	public void method1() {
		System.out.println("Body of Interfaceclass1");

	}
	public void method2() {
		System.out.println("Body of Interface2");
		
		
	}

	public static void main(String[] args) {
		Multipleclassinterface obj=new Multipleclassinterface();
		obj.method2();
		obj.method1();

	}

	

}
