package exceptionprog;

public class MultipleExc {
public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        finally {
        	System.out.println("rest of code in the block1");
        }
        try {
        	int a[]=new int[5]; 	
             a[6]=9;                                                        
            }    
        catch(ArrayIndexOutOfBoundsException e)
        {
                System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e)
        {
        	System.out.println("Parent exception occurs");
        }
        finally {
        	System.out.println("rest of code in the block2");
        }
	}
}
