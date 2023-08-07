package typecasting;

public class B extends A{
	@Override
	public void m1() {
		System.out.println("hii");
		
	}
	public static void main(String[] args) {
		B p1=new B();
		p1.m1();
		p1.m2();
	}

}
