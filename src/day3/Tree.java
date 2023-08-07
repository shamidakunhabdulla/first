package day3;

import java.util.Set;
import java.util.TreeMap;

public class Tree {
public static void main(String[] args) {
	TreeMap<String,Integer> t=new TreeMap();
	t.put("first", 12);
	t.put("second", 11);
	t.put("third",45);
	Set<String> s1=t.keySet();
	for(String key:s1) {
		System.out.println(key+" "+t.get(key));
	}
}
}
