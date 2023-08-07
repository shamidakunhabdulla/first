package day3;

public class HashMap {
public static void main(String[] args) {
	java.util.HashMap  h=new java.util.HashMap();
	h.put(10,"java");
	h.put('a',12);
	h.put("hello",122334);
	System.out.println(h.get('a'));
	System.out.println(h.get(12));
	System.out.println(h.containsKey(10));
	System.out.println(h.containsValue(12));
	h.remove(12);
	System.out.println(h);
	System.out.println(h.isEmpty());
	h.clear();
	System.out.println(h.isEmpty());
}
}
