package excelread;

import java.io.IOException;

public class Example1main {

	public static void main(String[] args) throws IOException {
		String y=Example1.getStringData(1, 0);
		System.out.print(y);
		String z=Example1.getIntegerData(1, 1);
		System.out.println(z);
		
		
		String k=Example1.getStringData(2, 0);
		System.out.print(k);
		String l=Example1.getIntegerData(2, 1);
		System.out.println(l);
	}

}
