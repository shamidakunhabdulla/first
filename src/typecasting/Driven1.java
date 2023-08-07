package typecasting;

public class Driven1 {
public static void main(String[] args) {
	Father f=new Daughter();
	if(f instanceof Son)
	{
		System.out.println("downcast to son");
		Son s=(Son)f;
		System.out.println(s.x+" "+s.y);
		
	}
	else if(f instanceof Daughter) {
		System.out.println("downcast to daughter");
		Daughter d=(Daughter)f;
		System.err.println(d.x+" "+d.silver);
		
	}
}
}
