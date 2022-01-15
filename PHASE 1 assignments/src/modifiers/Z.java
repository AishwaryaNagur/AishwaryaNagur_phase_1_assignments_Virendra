package modifiers;

public class Z extends M {
	public static void main(String[] args) {
		Z z= new Z();
		z.Methodprotected();
		z.Methodpublic();
		
		N n= new N();
		n.Methodpublic();
		
		P p= new P();
		p.Methodpublic();
		
		X x=new X();
		System.out.println("variable long of class X : "+x.h);
		System.out.println("variable float of class X : "+x.i);
		System.out.println("variable char of class X : "+x.j);
	}

}
