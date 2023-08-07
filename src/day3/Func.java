package day3;

public class Func {
public static void main(String[] args) {
	String s="software engineer  ";
	System.out.println(s.length());
	System.out.println(s.concat("hello"));
	System.out.println(s.startsWith("soft"));
	System.out.println(s.contains(s));
	System.out.println(s.indexOf('e'));
	System.out.println(s.indexOf('e'));
	
	System.out.println(s.trim());
	System.out.println(s.charAt(9));
	String s1="java";
	String s2="Java";
	String s3="JAVA";
	String s4="hello there";
	System.out.println(s1.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s4.substring(0,6));
	
	
	
	
}
}
