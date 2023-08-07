package day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linked {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> l=new LinkedHashMap();
	l.put(10, "iam");
	l.put(20, "Learning");
	l.put(30,"java");
	System.out.println(l);
	Set<Integer> s=l.keySet();
	for(int key:s) {
		System.out.println(key+" "+l.get(key));
	}
	HashMap<String, Double> h=new HashMap();
	h.put("dell", 115676.2);
	h.put("hp", 79869.5);
	Set<String > s1=h.keySet();
	for(String key:s1) {
		System.out.println(key  +" "+h.get(key));
	}
	
	
	
	
}
}
