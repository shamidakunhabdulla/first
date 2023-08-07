package day3;

import java.util.ArrayList;

public class Generics {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	for(Integer i:a) {
		System.out.println(i);
	}
	System.out.println("------------");
	for(int j:a) {
		System.out.println(j);
	}
	System.out.println("------------"); 
	for(Object o:a) {
		System.out.println(o);
	}
}
}
