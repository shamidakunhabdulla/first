package day3;

public class Obj {
	@Override
	public int hashCode() {
		
		return 1234;
	}
public static void main(String[] args) {
	Obj a=new Obj();
	Obj b=new Obj();
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(a.toString());
	System.out.println(b.toString());
	
}
}
