package collection;
import java.util.LinkedHashSet;
import java.util.Set;
public class Set1 {
	public static void main(String[] args) {
		//Set<String> obj=new LinkedHashSet<String>();
		Set<Integer> obj=new LinkedHashSet<Integer>();
		obj.add(10);
		obj.add(12);//add objects
		obj.add(14);
		System.out.println(obj);
		
		Set obj1=new LinkedHashSet();
		obj1.add("20");
		obj1.add("22");
		obj1.add("24");
		obj.addAll(obj1);//add new set of lists
		
		System.out.println(obj);
		//obj1.clear();
		System.out.println(obj1);
		System.out.println(obj);
		
		System.out.println(obj.contains("20"));
		System.out.println(obj.hashCode());
		System.out.println(obj.isEmpty());
		obj.remove(10);
	  	System.out.println(obj);
	  	obj.removeAll(obj1);
	  	System.out.println(obj);
	 /* 	Set obj2=new LinkedHashSet();
		obj2.add("30");
		obj2.add("32");
		obj2.add("34");
		obj.retainAll(obj2);*/
		System.out.println(obj);
        System.out.println(obj.size());
	}
}
