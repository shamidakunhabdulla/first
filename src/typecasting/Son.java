 package typecasting;

public class Son extends Father{
	int y=20;
	public static void main(String[] args) {
		Father f=new Son();
		Son s=(Son)f;
		System.out.println(f.x);
		System.out.println(s.y);
		
	}

}
