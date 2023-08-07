package inheritance;

public class Android extends Mobile {
	String version="p";
	 public void owner() {
		 
			System.out.println("Google");
			 
		 }
	public static void main(String[] args) {
		
		Android p1=new Android();
		System.out.println(p1.version);
		 System.out.println(p1.use);
		 p1.type();
		 p1.owner();
		
			
		
	}

}
