package day3;

import java.util.HashMap;
import java.util.Set;

public class Ex {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put(1, "hello");
	h.put(1, "replaced");
	h.put(2,"replaced");
	System.out.println(h);
	
}
}
