package innerclassprog;

public class MemberInner {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	// private int data=20;
	  
	  void msg()
	  {
		  //MemberInner.this.display();     //calling the outer method
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	 }  
	
	class InnerA{  		
		// private int data=40;
		  
		  void msg()
		  {
			  MemberInner.this.display();     //calling the outer method
			  System.out.println("data is "+data);
		  }  
		  
		  // calling the duplicate method of the outer class
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }// inner class accessing the outside private variable
		 }  
	
	
	public static void main(String args[]){  
	  
	  MemberInner obj=new MemberInner();     // creating object of Outer class
	  
	  MemberInner.Inner in=obj.new Inner(); // creating object of Inner class
	  MemberInner.InnerA on = obj.new InnerA();
	  in.msg();  
	  in.display(); 
	}

}
