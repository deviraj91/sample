package collection;
import java.util.LinkedList;
public class Linkedlist1 {
	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		obj.add("Devi");
		obj.add("bala");//add new data
		obj.add("nanu");
		obj.add("diya");
		System.out.println(obj);
		
		obj.add(1,"Balu");//add new data on a specific position
        System.out.println(obj);
        
        obj.addFirst("Sree");//add a new data on starting of the list
        obj.addLast("dhyan");//add a new data on last of the list
        System.out.println(obj);
        
        obj.remove("Devi");//remove the particular data
        System.out.println(obj);
        obj.remove(0);//remove the data on a specific index position
        System.out.println(obj);
        
        LinkedList obj1=new LinkedList();
        obj1.add("anu");
        obj1.add("unni");
        obj.addAll(obj1); //add new list along with old list
        System.out.println(obj);
        obj.removeAll(obj1); //remove the one list from the old list
        System.out.println(obj);
        obj.removeFirst();
        System.out.println(obj);
        obj.removeLast();
        System.out.println(obj);
        Boolean x= obj.contains("nanu");  //check whether the list contains
        System.out.println(x);
        System.out.println(obj.get(1));//get the object on a specific index            
	}
}
