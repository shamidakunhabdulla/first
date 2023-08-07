package inheritance;

public class Son extends Father{
	int height=167;
	void m3() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Son p1=new Son();
		System.out.println(p1.nature+p1.height);
		p1.m2();
		
	}

}
