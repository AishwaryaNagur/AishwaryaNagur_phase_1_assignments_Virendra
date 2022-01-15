package linkedmapprog;

import java.util.TreeMap;

public class Treemap {
public static void main(String[] args) {
    	
        TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
        fruits.put("apple", 24);
        fruits.put("banana",32 );
        fruits.put("mango",65 );
        fruits.put("cherry",87 );
        fruits.put("grapes", 12);
        fruits.put("pineapple", 43);
        fruits.put("custardapple", 45);
        fruits.put("kiwi", 34);
        fruits.put("orange", 47);
        fruits.put("guava",87 );
        
        for(String key:fruits.keySet()){
			System.out.println(key  +" : "+ fruits.get(key));
        }
    }
}


