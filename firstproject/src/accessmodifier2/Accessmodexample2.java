package accessmodifier2;

import accessmodifier.Accessmodexample;

public class Accessmodexample2 {

	public static void main(String[] args) {
		Accessmodexample obj2=new Accessmodexample();
		obj2.method1();//public - visible outside the package
		//obj2.method2();//private-no visiblity
		//obj2.method3();//protected -no vidsibility outside the package
		//obj2.method4();//Default-no vidsibility outside the package


	}

}
