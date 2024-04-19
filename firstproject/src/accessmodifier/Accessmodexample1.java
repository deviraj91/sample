package accessmodifier;

public class Accessmodexample1 {

	public static void main(String[] args) {
		Accessmodexample obj1=new Accessmodexample();
		obj1.method1();
		//obj1.method2(); //private-no visiblity
		obj1.method3();
		obj1.method4();

	}

}
