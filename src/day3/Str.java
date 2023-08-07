package day3;

public class Str {
 
  public static void main(String[] args) {
	  String s="java";
	System.out.println(s);
	System.out.println(s.hashCode());
	System.out.println(s.toString());
	String s1=new String("java");
	System.out.println(s1);
	System.out.println(s1.hashCode());
	System.out.println(s1.toString());
	System.out.println(s.equals(s1));
	char []s2= {'j','a','v','a'};
	String s3=new String(s2);
	System.out.println(s3);
	
}
  
}
