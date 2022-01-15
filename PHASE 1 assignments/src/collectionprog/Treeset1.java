package collectionprog;

import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args){

		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		TreeSet<String> treeset=new TreeSet<String>();

		treeset.add("apple");
		treeset.add("banana");
		treeset.add("orange");
		treeset.add("cherry");
		treeset.add("guava");
		treeset.add("pineapple");
		treeset.add("pomegranet");
		treeset.add("kivi");
		treeset.add("custardapple");
		treeset.add("grapes");

		System.out.println("Treeset is "+treeset);
		System.out.println("Size of Treeset is "+ treeset.size());

		System.out.println("Does Treeset contains this 'orange' fruit  " + treeset.contains("orange"));		
		System.out.println("is Treeset empty  " + treeset.isEmpty());
		//System.out.println("remove the element "+hs.remove("apple,cherry"));
		
		
		treeset.remove("apple");
		treeset.remove("cherry");
		treeset.add("pulm");
		treeset.add("watermelon");
		treeset.add("blueberry");
		
		System.out.println("Treeset is "+treeset);
		System.out.println("Size of Treeset is "+ treeset.size());

		
		//System.out.println("Does hashset contains this 'orange' fruit  " + hs.contains("orange"));		
		System.out.println("is Treeset empty  " + treeset.isEmpty());
		//System.out.println("remove the element "+hs.remove("apple,cherry"));
		
		

		treeset.clear();
		//System.out.println("get class  " +hs.getClass());

	    //System.out.println("is hashset empty  " +hs.isEmpty());
	}

}
