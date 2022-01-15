package linkedmapprog;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap {
	public static void main(String[] args) {

		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, new String("apple"));
		linkedHashMap.put(2, new String("banana"));
		linkedHashMap.put(3, new String("grapes"));
		linkedHashMap.put(4, new String("kiwi"));
		linkedHashMap.put(5, new String("mango"));
		linkedHashMap.put(6, new String("custardapple"));
		linkedHashMap.put(7, new String("orange"));
		linkedHashMap.put(8, new String("pineapple"));
		linkedHashMap.put(9, new String("cherry"));
		linkedHashMap.put(10, new String("guava"));


		System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
		System.out.println("\nValues of map after iterating over it : ");

		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ":\t" + linkedHashMap.get(key));
		}

		System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
		System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
		System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
		System.out.println("LinkedHashMap contains apple as value? : " + linkedHashMap.containsValue("apple"));
		System.out.println("LinkedHashMap contains banana as value? : " + linkedHashMap.containsValue("banana"));
		System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove("kiwi"));
		System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove("orange"));
		System.out.println("Content of LinkedHashMap after removing key 4: " + linkedHashMap);

		linkedHashMap.clear();
		System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	}


}
