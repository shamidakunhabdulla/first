package typecasting;

public class Driver {
	public static void main(String[] args) {
		
	Father f=new Father();
	Son s=new Son();
	Daughter d=new Daughter();
	// System.out.println(f instanceof Daughter);
	System.out.println(f instanceof Son);
	System.out.println(f instanceof Father);
	System.out.println(s instanceof Father);
	System.out.println(s instanceof Son);
	
	
	}
}
