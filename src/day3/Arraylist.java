package day3;

import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(null);
	a.add("java");
	a.add('a'); 
	a.add(23.56f);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(3));
	System.out.println(a.contains("java"));
	System.out.println(a.indexOf('a'));
	a.remove(23.56f);
	System.out.println(a.isEmpty());
	a.clear();
	System.out.println(a.isEmpty());
}
}
