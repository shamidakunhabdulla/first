package day3;

import java.util.LinkedList;

public class Excep7 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add("hello");
	l.add(40);
	l.add(50);
	l.add(34);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	System.out.println("================");
	for(int i=l.size()-1;i>=0;i--) {
		System.out.println(l.get(i));
	}
}
}
