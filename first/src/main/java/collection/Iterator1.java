package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("black");
		
		Iterator<String> it=color.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(color);

	}

}
