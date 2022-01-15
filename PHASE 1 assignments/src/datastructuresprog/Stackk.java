package datastructuresprog;

import java.util.Stack;

public class Stackk {
	public static void main(String[] args) 
	 { 
	     // Default initialization of Stack 
	     Stack stack1 = new Stack(); 

	     // Initialization of Stack using Generics 
	    // Stack<String> stack2 = new Stack<String>(); 

	     // pushing the elements 
	     stack1.push("apple"); 
	     stack1.push("mango"); 
	     stack1.push("banana"); 
	     stack1.push("grapes"); 
	     stack1.push("cherry"); 
	     
	     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("All"));
	     
	     // Fetching the element at the head of the Stack 1
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 

	     stack1.push("Gulbarga"); 
	     stack1.push("bangalore"); 
	     stack1.push("bellary");
	     stack1.push("belgavi"); 
	     stack1.push("bidar"); 
	     stack1.push("12");
	     stack1.push("45");
	     stack1.push("56");
	     stack1.push("72");
	     stack1.push('M');
	     stack1.push('F');


	     
	     // Fetching the element at the head of the Stack 2
	   //  System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 

	     // Priniting the Stack Elements 
	     System.out.println(stack1); 
	    // System.out.println(stack2); 
	     
	     // Removing elements using pop() method 
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.remove("bidar"));
	     System.out.println("Popped element from stack 1: " + stack1.remove("banana"));
	     System.out.println("Popped element from stack 1: " + stack1.remove("apple"));
	     System.out.println("Popped element from stack 1: " + stack1.remove("cherry"));
	     System.out.println("Popped element from stack 1: " + stack1.remove("mango"));
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	     System.out.println("Popped element from stack 1: " + stack1.remove("bangalore"));
	     System.out.println("Popped element from stack 1: " + stack1.remove("bellary"));
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     
	     
	     
	     
	     
	    // System.out.println("Popped element from stack 2: " + stack2.pop());      
	 } 

}
