package stringbuffer;

public class Insert {

	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("World");
		obj.insert(1, "hello");
		System.out.println("Insert function is " +obj);

		obj.replace(1, 3, "hai");
		System.out.println("Replace function is " +obj);
		
		obj.delete(1, 3);
		System.out.println("Delete function is " +obj);
		
		obj.append("devi");
		System.out.println("Append funtion is " +obj);
		
	}

}

