package aggregation;

public class Studentdetails {
String sub;
int marks;
School a;
	public Studentdetails(String sub,int marks,School a)
	{
		this.sub=sub;
		this.marks=marks;
		this.a=a;
	}
	public void print()
	{
		System.out.println(a.name );
		System.out.println(a.age );
		System.out.println(sub );
		System.out.println(marks);
	}
	public static void main(String[] args) {
		School b=new School("Abi",12);
		Studentdetails c=new Studentdetails("maths",90,b);
		c.print();
	}
}
