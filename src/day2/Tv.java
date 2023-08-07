package day2;

public class Tv {
	String brand;
	double cost;
	float size;
	{
		System.out.println("tv details");
	}
public static void main(String[] args) {
	Tv f1=new Tv();
	f1.brand="LG";
	f1.cost=25000;
	f1.size=32;
	f1.print();
	Tv f2=new Tv();
	f2.brand="Lenovo";
	f2.cost=26000;
	f2.size=30;
	f2.print();
	Tv f3=new Tv();
	f3.brand="Sony";
	f3.cost=21000;
	f3.size=32;
	f3.print();
}
void print() {
	System.out.println(brand);
	System.out.println(cost);
	System.out.println(size);
}
{
	System.out.println("end");
	}

}
