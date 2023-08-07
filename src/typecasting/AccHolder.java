package typecasting;

public class  AccHolder implements ReserveBank,SBI {
   @Override
   public void print() {
	   System.out.println("cash recieved");
   }
   public void deposit() {
	   System.out.println("deposited 2500 rupees");
   }
   public static void main(String[] args) {
	   AccHolder s=new AccHolder();
	   s.print();
	   s.deposit();
}
}
