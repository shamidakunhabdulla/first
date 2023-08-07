package inheritance;

public class Ios extends Mobile {
	String version="16";
	public void owner() {
		 System.out.println("Apple");
	 }
	public static void main(String[] args) {	 String version="16.0.0";
	 
	 Ios p2= new Ios();
	 System.out.println(p2.version);
	 System.out.println(p2.use);
	 p2.type();
	 p2.owner();
	 

		
	}


}

