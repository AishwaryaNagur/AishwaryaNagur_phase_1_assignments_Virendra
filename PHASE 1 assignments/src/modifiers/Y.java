package modifiers;

public class Y  extends N{
	public static void main(String[] args) {
		M m= new M();
		m.Methodpublic();
		
		Y y= new Y();
		y.Methodprotected();
		y.Methodpublic();
		
		
		X x= new X();

		System.out.println("variable long of class X : "+x.h);
		System.out.println("variable float of class X : "+x.i);
		System.out.println("variable char of class X : "+x.j);
	}

}
