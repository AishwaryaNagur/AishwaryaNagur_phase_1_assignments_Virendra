package functionoverloadingprog;

public class Functionoverload {
	public static void calculate(int a,int b) {
		System.out.println("add "+(a+b));
	}
	public static  void calculate(int r) {
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	public static void calculate(double b, int l) {
		System.out.println("Area of recatngle: "+(b*l));
	}
	public static void main(String[] args) {
		calculate(7,4);
		calculate(9);
		calculate(6.88,5);
		
	}

}
