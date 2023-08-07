package typecasting;

public class M1 implements Person {
	public void eat() {
		System.out.println("fish and rice");
	}
	public static void main(String[] args) {
		System.out.println(Person.name);
		M1 p=new M1();
		p.eat();
		
	}

}
