package day2;

public class Laptop {
	String brand;
	int mac_address;
	int cost;
public static void main(String[] args) {
	Laptop l1=new Laptop();
	l1.brand="lenovo";
	l1.mac_address=345787;
	l1.cost=67000;
	Laptop l2=new Laptop();
	l2.brand="lenovo";
	l2.mac_address=345757;
	l2.cost=68000;
	l1.print();
	l2.print();
}
void print() {
	System.out.println(brand);
	System.out.println(mac_address);
	System.out.println(cost);
}

}
