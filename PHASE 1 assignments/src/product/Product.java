package product;

public class Product {
	int id = 78;
	String name = "Amul";
	
	 void display(int id , String name) {
		System.out.println("Name is " +name+ " id " +id);
	}
}
class A extends Product{
	int count=50;
	String category= "butter";
	
	 void display() {
		System.out.println("category : " + category+ "count : " + count +  "Name is " + name + " id "+ id);
	}
}
class B extends Product{
	int count=90;
	String category="milk";
	
	 void display() {
		System.out.println("category : " + category+ "count : " + count +  "Name is " + name + " id "+id);
	}
}
class C extends Product{
	int count=56;
	String category = "choco";
	
	 void display() {
		System.out.println("category : " + category+ "count : " + count +  "Name is " + name + " id "+id);
	}
}
class subA extends A {
	int price=30;
	int totalprice = count*price;
	
      void display() {
		System.out.println("category : " + category+ "count : " + count +  "Name is " + name + " id "+id);
	}
}
class subB extends B {
	int price= 10; 
	int totalprice = count*price;
	
	void display() {
		System.out.println("category : " + category+ "count : " + count +  "Name is " + name + " id "+id);
	}

public class multilevel{
	public static void main(String[] args) {
		subA a = new subA();
		subB b = new subB();
		C c=new C();
		a.display();
		b.display();
		c.display();
	}
}

}
