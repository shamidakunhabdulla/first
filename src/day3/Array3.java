package day3;

public class Array3 {
String brand;
int ram;
String processor;

public Array3(String brand, int ram, String processor) {
	super();
	this.brand = brand;
	this.ram = ram;
	this.processor = processor;
}
@Override
public String toString() {
	return brand+" "+ram+" "+processor;
	
}
public static void main(String[] args) {
	Array3 b=new Array3("dell",12,"i7");
	System.out.println(b);
	System.out.println(b.toString());
}

}

