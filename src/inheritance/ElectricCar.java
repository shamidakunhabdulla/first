package inheritance;

public class ElectricCar extends Car{
	String model="2324p";
	public static void main(String[] args) {
		ElectricCar p1=new ElectricCar();
		System.out.println(p1.use);
		System.out.println(p1.model);
		System.out.println(p1.brand);
		p1.type();
		p1.charging_time();
		p1.boot_capacity();

	}
	void charging_time() {
		System.out.println("fast");
		
	}

	

}
