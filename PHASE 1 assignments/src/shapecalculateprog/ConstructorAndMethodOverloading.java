package shapecalculateprog;

public class ConstructorAndMethodOverloading {
	ConstructorAndMethodOverloading()
	{
		
	}
	int a;
	float b;
	double c;
	ConstructorAndMethodOverloading(int y)
	{
		a=y*y;
	}
	ConstructorAndMethodOverloading(float m,float n)
	{
		b= m*n;
	}
	ConstructorAndMethodOverloading(double z )
	{
		c=3.14*z*z;
	}
	void Area()
	{
		System.out.println("Area of square: "+a);
		System.out.println("Area of rectangle: "+b);
		System.out.println("Area of circle: "+c);
	}
	public static void main(String[] args) {
		ConstructorAndMethodOverloading p= new ConstructorAndMethodOverloading(4.8);
		p.Area();
		ConstructorAndMethodOverloading q= new ConstructorAndMethodOverloading(2.24f,7.12f);
		q.Area();
		ConstructorAndMethodOverloading r= new ConstructorAndMethodOverloading(6f);
		r.Area();
	}

}
