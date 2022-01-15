package modifiers;

public class P {
	private void Methodprivate() {
		System.out.println("private method of P");
	}
	void Methoddefault() {
		System.out.println("private method of P");
	}
	protected void Methodprotected() {
		System.out.println("private method of P");
	}
	public void Methodpublic() {
		System.out.println("private method of P");
	}
	

	public static void main(String[] args) {
		M m = new M();
		N n = new N();
		System.out.println("variable long of M class : "+m.b);
		System.out.println("variable float of M class : "+m.c);
		System.out.println("variable long of N class : "+n.d);
		System.out.println("variable int of N class : "+n.e);
		
	}

}
