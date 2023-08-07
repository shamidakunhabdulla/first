package day2;

public class Prog8 {
	String name;
	int cabin;
	int dept;
	
	public static void main(String[] args) {
		Prog8 p1=new Prog8("innovature",99,19);
		p1.details();
		
	}
	Prog8(String name,int cabin,int dept){
		this.name=name;
		this.cabin=cabin;
		this.dept=dept;
		
	}
	public void details() {
		System.out.println(name+" " +cabin+" "+dept);
	}
	

}
