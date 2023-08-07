package day3;

import java.util.HashSet;
import java.util.TreeSet;

public class Hash {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(23);
	h.add("hasg");
	h.add(10);
	h.add(10);
	System.out.println(h.size());
	for(Object o:h) {
		System.out.println(o);
	}
	TreeSet<Integer> t=new TreeSet<Integer>()
;
	t.add(10);
	t.add(20);
	t.add(30);
	t.add(40);
	t.add(50);
	t.add(60);
	for(int i:t) {
		System.out.println(i);
	}
	System.out.println(t);
}
}
