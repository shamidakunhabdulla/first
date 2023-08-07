package day3;

import java.util.ArrayList;

public class Lap {
String brand;
int cost;
public Lap(String brand, int cost) {
	super();
	this.brand = brand;
	this.cost = cost;
}
@Override
public String toString() {
	return brand+" "+cost;
}
public static void main(String[] args) {
	Lap l1=new Lap("dell",235677);
	Lap l2=new Lap("lenovo",235677);
	Lap l3=new Lap("apple",235677);
	ArrayList<Lap> a=new ArrayList<Lap>();
	a.add(l1);
	a.add(l2);
	a.add(l3);
	a.add(new Lap("hp",34777));
	for(Lap l:a) {
		System.out.println(l );
	}
	
	
}
}
