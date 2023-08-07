package typecasting;

public class Daughter extends Father {
 String silver="1 nn kg";
 void purchase() {
	 System.out.println("kalyan jewellers");
 }
 public static void main(String[] args) {
	 Father m=new Daughter();
	 Daughter d=(Daughter)m;
//	 System.out.println(m.gold);
//	 System.out.println(d.silver);
//	 m.purchase1();
//	 d.purchase();
	
}
}
