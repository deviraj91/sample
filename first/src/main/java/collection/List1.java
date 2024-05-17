package collection;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List <String> obj= new ArrayList<String>();
		obj.add("anu");
		obj.add("Devi");
		obj.add("anu");
		obj.add("anu");
		System.out.println(obj);
		obj.set(2, "Raj");
		System.out.println(obj);
		int a=obj.indexOf("anu");
		System.out.println(a);
		int b=obj.lastIndexOf("anu");
		System.out.println(b);
		
		obj.remove("anu");
		System.out.println(obj);
		obj.get(1);
		System.out.println(obj);
		boolean x=obj.contains("Devi");
		System.out.println(x);
	}

}
