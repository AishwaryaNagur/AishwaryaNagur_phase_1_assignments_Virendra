package collectionprog;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
	public static void main(String[] args){

		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		LinkedHashSet<String> hs=new LinkedHashSet<String>();

		hs.add("apple");
		hs.add("banana");
		hs.add("orange");
		hs.add("cherry");
		hs.add("guava");
		hs.add("pineapple");
		hs.add("pomegranet");
		hs.add("kivi");
		hs.add("custardapple");
		hs.add("grapes");

		System.out.println("LinkedHashset is "+hs);
		System.out.println("Size of Linkedashset is "+ hs.size());

		System.out.println("Does Linkedhashset contains this 'orange' fruit  " + hs.contains("orange"));		
		System.out.println("is Linkedhashset empty  " + hs.isEmpty());
		//System.out.println("remove the element "+hs.remove("apple,cherry"));
		
		
		hs.remove("apple");
		hs.remove("cherry");
		hs.add("pulm");
		hs.add("watermelon");
		hs.add("blueberry");
		
		System.out.println("Hashset is "+hs);
		System.out.println("Size of LinkedHashset is "+ hs.size());

		
		//System.out.println("Does hashset contains this 'orange' fruit  " + hs.contains("orange"));		
		System.out.println("is Linkedhashset empty  " + hs.isEmpty());
		//System.out.println("remove the element "+hs.remove("apple,cherry"));
		
		

		hs.clear();
		//System.out.println("get class  " +hs.getClass());

	    //System.out.println("is hashset empty  " +hs.isEmpty());
	}

}
